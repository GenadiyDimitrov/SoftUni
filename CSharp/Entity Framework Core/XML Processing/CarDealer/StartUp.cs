using AutoMapper;
using AutoMapper.QueryableExtensions;
using CarDealer.Data;
using CarDealer.Dtos.Export;
using CarDealer.Dtos.Import;
using CarDealer.Models;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace CarDealer
{
    public class StartUp
    {
        private static IMapper mapper;

        public static void Main(string[] args)
        {
            var dbContext = new CarDealerContext();

            //ResetDatabase(dbContext);

            //Console.WriteLine(GetCarsWithDistance(dbContext));
        }

        public static void ResetDatabase(CarDealerContext context)
        {
            context.Database.EnsureDeleted();
            context.Database.EnsureCreated();

            Seed(context);
        }

        public static void Seed(CarDealerContext context)
        {
            #region PrepareXMLs
            var carsXmlString = File.ReadAllText("Datasets/cars.xml");
            var customersXmlString = File.ReadAllText("Datasets/customers.xml");
            var partsXmlString = File.ReadAllText("Datasets/parts.xml");
            var salesXmlString = File.ReadAllText("Datasets/sales.xml");
            var suppliersXmlString = File.ReadAllText("Datasets/suppliers.xml");
            #endregion

            ImportSuppliers(context, suppliersXmlString);
            ImportParts(context, partsXmlString);
            ImportCars(context, carsXmlString);
            ImportCustomers(context, customersXmlString);
            ImportSales(context, salesXmlString);
        }

        #region Import Data
        public static string ImportSuppliers(CarDealerContext context, string inputXml)
        {
            GenerateMapper();

            var suppliersDto = Deserializer<List<ImportSupplierDto>>(Constants.Suppliers, inputXml);

            var suppliers = mapper.Map<List<Supplier>>(suppliersDto);

            context.Suppliers.AddRange(suppliers);
            context.SaveChanges();

            return String.Format(Constants.Notifications.SuccessfullyImported, suppliers.Count());
        }

        public static string ImportParts(CarDealerContext context, string inputXml)
        {
            GenerateMapper();

            var partsDtos = Deserializer<List<ImportPartDto>>(Constants.Parts, inputXml);

            var parts = mapper.Map<List<Part>>(partsDtos)
                .Where(p => context.Suppliers.Find(p.SupplierId) != null);

            context.Parts.AddRange(parts);
            context.SaveChanges();

            return String.Format(Constants.Notifications.SuccessfullyImported, parts.Count());
        }

        public static string ImportCars(CarDealerContext context, string inputXml)
        {
            GenerateMapper();

            var carsDtos = Deserializer<List<ImportCarDto>>(Constants.Cars, inputXml);

            var existingPartsIds = context.Parts.Select(p => p.Id).ToList();

            var cars = new List<Car>();

            foreach (var car in carsDtos)
            {
                var currentCar = mapper.Map<Car>(car);

                foreach (var part in car.PartsIds.Distinct())
                {
                    if (existingPartsIds.Contains(part.PartId)
                        && !currentCar.PartsCars.Any(pc => pc.PartId == part.PartId))
                    {
                        var currentCarPart = new PartCar
                        {
                            PartId = part.PartId,
                            CarId = currentCar.Id
                        };

                        currentCar.PartsCars.Add(currentCarPart);
                    }
                }

                cars.Add(currentCar);
            }

            context.AddRange(cars);
            context.SaveChanges();

            return String.Format(Constants.Notifications.SuccessfullyImported, cars.Count());
        }

        public static string ImportCustomers(CarDealerContext context, string inputXml)
        {
            GenerateMapper();

            var customersDtos = Deserializer<List<ImportCustomerDto>>(Constants.Customers, inputXml);

            var customers = mapper.Map<List<Customer>>(customersDtos);

            context.Customers.AddRange(customers);
            context.SaveChanges();

            return String.Format(Constants.Notifications.SuccessfullyImported, customers.Count());
        }

        public static string ImportSales(CarDealerContext context, string inputXml)
        {
            GenerateMapper();

            var salesDtos = Deserializer<List<ImportSaleDto>>(Constants.Sales, inputXml);

            var sales = mapper.Map<List<Sale>>(salesDtos)
                .Where(s => context.Cars.Any(c => c.Id == s.CarId));

            context.Sales.AddRange(sales);
            context.SaveChanges();

            return String.Format(Constants.Notifications.SuccessfullyImported, sales.Count());
        }
        #endregion

        #region Query Tasks
        public static string GetCarsWithDistance(CarDealerContext context)
        {
            GenerateMapper();

            var cars = context.Cars
                .Where(c => c.TraveledDistance >= 2000000)
                .OrderBy(c => c.Make)
                .ThenBy(c => c.Model)
                .Take(10)
                .ProjectTo<ExportCarWithDistanceDto>(mapper.ConfigurationProvider)
                .ToList();

            return Serializer(cars, Constants.CarsLowerCase);
        }

        public static string GetCarsFromMakeBmw(CarDealerContext context)
        {
            GenerateMapper();

            var cars = context.Cars
                .Where(c => c.Make.Contains("bmw", StringComparison.OrdinalIgnoreCase))
                .OrderBy(c => c.Model)
                .ThenByDescending(c => c.TraveledDistance)
                .ProjectTo<ExportCarFromMakeBmwDto>(mapper.ConfigurationProvider)
                .ToList();

            return Serializer<List<ExportCarFromMakeBmwDto>>(cars, Constants.CarsLowerCase);
        }

        public static string GetLocalSuppliers(CarDealerContext context)
        {
            //var totalSales = context.Suppliers
            //   .Where(c => !c.IsImporter)
            //   .Select(c => new ExportSalesPerCustomerDTO
            //   {
            //       FullName = c.Name,
            //       BoughtCars = c.Sales.Count,
            //       SpentMoney = c.Sales.Sum(s =>
            //           s.Car.PartsCars.Sum(pc =>
            //               Math.Round(c.IsYoungDriver ? pc.Part.Price * 0.95m : pc.Part.Price, 2)
            //           )
            //       )
            //   })
            //   .OrderByDescending(s => s.SpentMoney)
            //   .ToArray();

            //return SerializeToXml<ExportSalesPerCustomerDTO[]>(totalSales, "customers");

            GenerateMapper();

            var suppliers = context.Suppliers
                .Where(s => !s.IsImporter)
                .ProjectTo<ExportLocalSupplierDto>(mapper.ConfigurationProvider)
                .ToList();

            return Serializer<List<ExportLocalSupplierDto>>(suppliers, Constants.SuppliersLowerCase);
        }

        public static string GetCarsWithTheirListOfParts(CarDealerContext context)
        {
            GenerateMapper();

            var cars = context.Cars
                .OrderByDescending(c => c.TraveledDistance)
                .ThenBy(c => c.Model)
                .Take(5)
                .ProjectTo<ExportCarWithListOfPartsDto>(mapper.ConfigurationProvider)
                .ToList();

            return Serializer<List<ExportCarWithListOfPartsDto>>(cars, Constants.CarsLowerCase);
        }

        public static string GetTotalSalesByCustomer(CarDealerContext context)
        {
            var totalSales = context.Customers
               .Where(c => c.Sales.Any())
               .Select(c => new ExportSalesPerCustomerDTO
               {
                   FullName = c.Name,
                   BoughtCars = c.Sales.Count,
                   SpentMoney = c.Sales.Sum(s =>
                       s.Car.PartsCars.Sum(pc =>
                           Math.Round(c.IsYoungDriver ? pc.Part.Price * 0.95m : pc.Part.Price, 2)
                       )
                   )
               })
               .OrderByDescending(s => s.SpentMoney)
               .ToArray();

            return SerializeToXml<ExportSalesPerCustomerDTO[]>(totalSales, "customers");
        }

        public static string GetSalesWithAppliedDiscount(CarDealerContext context)
        {

            ExportSaleAppliedDiscountDTO[] sales = context.Sales
                .Select(s => new ExportSaleAppliedDiscountDTO()
                {
                    Car = new ExportCarWithAttrDTO()
                    {
                        Make = s.Car.Make,
                        Model = s.Car.Model,
                        TraveledDistance = s.Car.TraveledDistance
                    },
                    Discount = (int)s.Discount,
                    CustomerName = s.Customer.Name,
                    Price = s.Car.PartsCars.Sum(p => p.Part.Price),
                    PriceWithDiscount =
                        Math.Round((double)(s.Car.PartsCars
                            .Sum(p => p.Part.Price) * (1 - (s.Discount / 100))), 4)
                })
                .ToArray();

            return SerializeToXml<ExportSaleAppliedDiscountDTO[]>(sales, "sales");
        }
        #endregion

        #region Private Methods
        private static T Deserializer<T>(string rootTag, string inputXml)
        {
            XmlRootAttribute root = new XmlRootAttribute(rootTag);
            XmlSerializer serializer = new XmlSerializer(typeof(T), root);

            T dtos;

            using (StringReader reader = new StringReader(inputXml))
            {
                dtos = (T)serializer.Deserialize(reader);
            }

            return dtos;
        }

        private static string Serializer<T>(T dto, string rootTag)
        {

            XmlSerializer serializer = new(typeof(T), new XmlRootAttribute(rootTag));
            StringBuilder sb = new();

            using (StringWriter writer = new(sb))
            {
                XmlSerializerNamespaces namespaces = new();
                namespaces.Add(string.Empty, string.Empty);
                try
                {
                    serializer.Serialize(writer, dto, namespaces);
                }
                catch (Exception)
                {

                    throw;
                }
            }

            return sb.ToString();
        }
        private static string SerializeToXml<T>(T dto, string xmlRootAttribute)
        {
            XmlSerializer xmlSerializer =
                new XmlSerializer(typeof(T), new XmlRootAttribute(xmlRootAttribute));

            StringBuilder stringBuilder = new StringBuilder();

            using (StringWriter stringWriter = new StringWriter(stringBuilder, CultureInfo.InvariantCulture))
            {
                XmlSerializerNamespaces xmlSerializerNamespaces = new XmlSerializerNamespaces();
                xmlSerializerNamespaces.Add(string.Empty, string.Empty);

                try
                {
                    xmlSerializer.Serialize(stringWriter, dto, xmlSerializerNamespaces);
                }
                catch (Exception)
                {

                    throw;
                }
            }

            return stringBuilder.ToString();
        }

        private static void GenerateMapper()
        {
            MapperConfiguration config = new MapperConfiguration(cnfg =>
            {
                cnfg.AddProfile<CarDealerProfile>();
            });

            mapper = config.CreateMapper();
        }
        #endregion
    }
}