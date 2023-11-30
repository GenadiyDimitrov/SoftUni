namespace Invoices.DataProcessor
{
    using System.ComponentModel.DataAnnotations;
    using System.Globalization;
    using System.Text;
    using Invoices.Data;
    using Invoices.Data.Models;
    using Invoices.DataProcessor.ImportDto;

    public class Deserializer
    {
        private const string ErrorMessage = "Invalid data!";

        private const string SuccessfullyImportedClients
            = "Successfully imported client {0}.";

        private const string SuccessfullyImportedInvoices
            = "Successfully imported invoice with number {0}.";

        private const string SuccessfullyImportedProducts
            = "Successfully imported product - {0} with {1} clients.";


        public static string ImportClients(InvoicesContext context, string xmlString)
        {
            StringBuilder stringBuilder = new();
            ImportClientDto[] clients = xmlString.DeserializeFromXml<ImportClientDto[]>("Clients");
            List<Client> validClients = new();
            foreach (var client in clients)
            {
                if (!IsValid(client))
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }
                Client clientToAdd = new()
                {
                    Name = client.Name,
                    NumberVat = client.NumberVat,
                };
                foreach (var address in client.Addresses)
                {
                    if (IsValid(address))
                    {
                        clientToAdd.Addresses.Add(new()
                        {
                            City = address.City,
                            Country = address.Country,
                            StreetName = address.StreetName,
                            StreetNumber = address.StreetNumber,
                            PostCode = address.PostCode,
                        });
                    }
                    else
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                    }
                }

                validClients.Add(clientToAdd);
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedClients, clientToAdd.Name));
            }
            context.Clients.AddRange(validClients);
            context.SaveChanges();

            return stringBuilder.ToString();
        }


        public static string ImportInvoices(InvoicesContext context, string jsonString)
        {
            ImportInvoiceDto[] importInvoiceDtos = jsonString.DeserializeFromJson<ImportInvoiceDto[]>();
            StringBuilder stringBuilder = new();
            List<Invoice> validInvoices = new();
            foreach (var invoiceDto in importInvoiceDtos)
            {
                if (!IsValid(invoiceDto) || invoiceDto.IssueDate > invoiceDto.DueDate || (invoiceDto.DueDate == DateTime.ParseExact("01/01/0001", "dd/MM/yyyy", CultureInfo.InvariantCulture) || invoiceDto.IssueDate == DateTime.ParseExact("01/01/0001", "dd/MM/yyyy", CultureInfo.InvariantCulture)))
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }

                validInvoices.Add(new()
                {
                    Amount = invoiceDto.Amount,
                    ClientId = invoiceDto.ClientId,
                    CurrencyType = invoiceDto.CurrencyType,
                    DueDate = invoiceDto.DueDate,
                    IssueDate = invoiceDto.IssueDate,
                    Number = invoiceDto.Number,
                });
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedInvoices, invoiceDto.Number));
            }
            context.Invoices.AddRange(validInvoices);
            context.SaveChanges();

            return stringBuilder.ToString();
        }

        public static string ImportProducts(InvoicesContext context, string jsonString)
        {
            ImportProductDto[] ImportProductDtos = jsonString.DeserializeFromJson<ImportProductDto[]>();
            StringBuilder stringBuilder = new();
            List<Product> validProducts = new();
            var clientsIds = context.Clients.Select(c => c.Id).ToList();
            foreach (var productDto in ImportProductDtos)
            {
                if (!IsValid(productDto))
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }
                Product productToAdd = new()
                {
                    CategoryType = productDto.CategoryType,
                    Name = productDto.Name,
                    Price = productDto.Price,
                };
                foreach (var clientId in productDto.Clients.Distinct())
                {
                    if (!clientsIds.Contains(clientId))
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }
                    productToAdd.ProductsClients.Add(new() { ClientId = clientId });
                }
                validProducts.Add(productToAdd);
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedProducts, productToAdd.Name, productToAdd.ProductsClients.Count));
            }
            context.Products.AddRange(validProducts);
            context.SaveChanges();

            return stringBuilder.ToString();
        }

        public static bool IsValid(object dto)
        {
            var validationContext = new ValidationContext(dto);
            var validationResult = new List<ValidationResult>();

            return Validator.TryValidateObject(dto, validationContext, validationResult, true);
        }
    }
}
