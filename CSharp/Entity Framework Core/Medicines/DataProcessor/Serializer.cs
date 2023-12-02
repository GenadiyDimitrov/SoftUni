namespace Medicines.DataProcessor
{
    using Medicines.Data;
    using Medicines.Data.Models;
    using Medicines.DataProcessor.ExportDtos;
    using Microsoft.EntityFrameworkCore;
    using System.Globalization;

    public class Serializer
    {
        public static string ExportPatientsWithTheirMedicines(MedicinesContext context, string date)
        {
            //<Patients>
            DateTime dateTime = DateTime.ParseExact(date, "yyyy-MM-dd", CultureInfo.InvariantCulture);

            var patients = context.Patients
                .Where(p => p.PatientsMedicines.Any(pm => pm.Medicine.ProductionDate > dateTime))
                .Include(p => p.PatientsMedicines)
                .ToList();
            List<ExportPatientDto> patientDtos = new();
            foreach (var p in patients)
            {
                ExportPatientDto patientDto = new()
                {
                    AgeGroup = p.AgeGroup.ToString(),
                    Gender = p.Gender.ToString().ToLower(),
                    Name = p.FullName
                };
                List<ExportMedicineXmlDto> medicinesDtos = new();
                foreach (var medicine in p.PatientsMedicines.Select(pm => pm.Medicine))
                {
                    if (medicine.ProductionDate > dateTime)
                    {
                        medicinesDtos.Add(new()
                        {
                            Category = medicine.Category.ToString().ToLower(),
                            Name = medicine.Name,
                            Price = $"{medicine.Price:F2}",
                            PriceDecimal = medicine.Price,
                            BestBefore = medicine.ExpiryDate.ToString("yyyy-MM-dd"),
                            BestBeforeDateTime = medicine.ExpiryDate,
                            Producer = medicine.Producer,
                        });
                    }
                }
                patientDto.Medicines = medicinesDtos
                    .OrderByDescending(m => m.BestBeforeDateTime)
                    .ThenBy(m => m.PriceDecimal)
                    .ToArray();

                patientDtos.Add(patientDto);
            }

            return patientDtos
                .OrderByDescending(p => p.Medicines.Length)
                .ThenBy(p => p.Name)
                .ToArray()
                .SerializeToXml("Patients");
        }

        public static string ExportMedicinesFromDesiredCategoryInNonStopPharmacies(MedicinesContext context, int medicineCategory)
        {
            var pharmacies = context.Pharmacies
                .Where(p => p.IsNonStop && p.Medicines.Any(m => (int)m.Category == medicineCategory))
                .Select(p => p)
                .Include(p => p.Medicines)
                .ToList();
            List<ExportMedicineJsonDto> medicineDtos = new();
            foreach (var p in pharmacies)
            {
                foreach (var medicine in p.Medicines)
                {
                    if ((int)medicine.Category == medicineCategory)
                    {
                        medicineDtos.Add(new()
                        {
                            Name = medicine.Name,
                            Price = $"{medicine.Price:F2}",
                            PriceDecimal = medicine.Price,
                            Pharmacy = new()
                            {
                                Name = p.Name,
                                PhoneNumber = p.PhoneNumber
                            }
                        });
                    }
                }
            }
            return medicineDtos
                    .OrderBy(m => m.PriceDecimal)
                    .ThenBy(m => m.Name)
                    .ToArray()
                    .SerializeToJson();

        }
    }
}
