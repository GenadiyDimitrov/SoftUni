namespace Medicines.DataProcessor
{
    using Medicines.Data;
    using Medicines.Data.Models;
    using Medicines.Data.Models.Enums;
    using Medicines.DataProcessor.ImportDtos;
    using System.ComponentModel.DataAnnotations;
    using System.Data.SqlTypes;
    using System.Globalization;
    using System.Text;

    public class Deserializer
    {
        private const string ErrorMessage = "Invalid Data!";
        private const string SuccessfullyImportedPharmacy = "Successfully imported pharmacy - {0} with {1} medicines.";
        private const string SuccessfullyImportedPatient = "Successfully imported patient - {0} with {1} medicines.";

        public static string ImportPatients(MedicinesContext context, string jsonString)
        {
            StringBuilder stringBuilder = new();
            ImportPatientDbo[] pacients = jsonString.DeserializeFromJson<ImportPatientDbo[]>();
            List<Patient> validPatients = new();
            foreach (var patient in pacients)
            {
                if (!IsValid(patient) || patient.Medicines == null || patient.Medicines.Length == 0)
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }
                Patient patientToAdd = new()
                {
                    FullName = patient.FullName,
                    AgeGroup = (AgeGroup)patient.AgeGroup,
                    Gender = (Gender)patient.Gender,
                };

                foreach (var medicineId in patient.Medicines)
                {
                    if (patientToAdd.PatientsMedicines.Any(pm => pm.MedicineId == medicineId))
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }

                    patientToAdd.PatientsMedicines.Add(new()
                    {
                        MedicineId = medicineId
                    });
                }

                validPatients.Add(patientToAdd);
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedPatient, patientToAdd.FullName, patientToAdd.PatientsMedicines.Count));
            }
            ////TODO DB save
            context.Patients.AddRange(validPatients);
            context.SaveChanges();

            return stringBuilder.ToString();
        }

        public static string ImportPharmacies(MedicinesContext context, string xmlString)
        {
            StringBuilder stringBuilder = new();
            ImportPharmacyDto[] pharmacies = xmlString.DeserializeFromXml<ImportPharmacyDto[]>("Pharmacies");
            List<Pharmacy> validPharmacies = new();
            foreach (var pharmacyDto in pharmacies)
            {
                if (!IsValid(pharmacyDto) || (pharmacyDto.IsNonStop != "true" && pharmacyDto.IsNonStop != "false"))
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }
                Pharmacy pharmacyToAdd = new()
                {
                    Name = pharmacyDto.Name,
                    IsNonStop = pharmacyDto.IsNonStop == "true",
                    PhoneNumber = pharmacyDto.PhoneNumber,
                };

                foreach (var medicineDto in pharmacyDto.Medicines)
                {
                    DateTime productionDate = DateTime.MinValue;
                    DateTime expiryDate = DateTime.MinValue;
                    if (DateTime.TryParse(medicineDto.ProductionDate, out DateTime pD))
                    {
                        productionDate = pD;
                    }
                    else
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }
                    if (DateTime.TryParse(medicineDto.ExpiryDate, out DateTime eD))
                    {
                        expiryDate = eD;
                    }
                    else
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }
                    if (!IsValid(medicineDto) || productionDate.ToString("yyyy-MM-dd") == expiryDate.ToString("yyyy-MM-dd") || productionDate >= expiryDate || (productionDate == DateTime.ParseExact("0001-01-01", "yyyy-MM-dd", CultureInfo.InvariantCulture) || expiryDate == DateTime.ParseExact("0001-01-01", "yyyy-MM-dd", CultureInfo.InvariantCulture)))
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }
                    if (pharmacyToAdd.Medicines.Any(m => m.Name == medicineDto.Name && m.Producer == medicineDto.Producer))
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }

                    pharmacyToAdd.Medicines.Add(new()
                    {
                        Category = (Category)medicineDto.Category,
                        ProductionDate = productionDate,
                        ExpiryDate = expiryDate,
                        Name = medicineDto.Name,
                        Producer = medicineDto.Producer,
                        Price = medicineDto.Price,
                    });
                }

                validPharmacies.Add(pharmacyToAdd);
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedPharmacy, pharmacyToAdd.Name, pharmacyToAdd.Medicines.Count));
            }
            ////TODO DB save
            context.Pharmacies.AddRange(validPharmacies);
            context.SaveChanges();

            return stringBuilder.ToString();
        }

        private static bool IsValid(object dto)
        {
            var validationContext = new ValidationContext(dto);
            var validationResult = new List<ValidationResult>();

            return Validator.TryValidateObject(dto, validationContext, validationResult, true);
        }
    }
}
