using Medicines.Data.Models;
using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using System.Xml.Serialization;

namespace Medicines.DataProcessor.ImportDtos
{
    [XmlType("Medicine")]
    public class ImportMedicineDto
    {
        [Required]
        [MinLength(3)]
        [MaxLength(150)]
        public string Name { get; set; }
        [Required]
        [Range(0.01, 1000.00)]
        public decimal Price { get; set; }
        [Required]
        public string ProductionDate { get; set; }
        [Required]
        public string ExpiryDate { get; set; }
        [Required]
        [MinLength(3)]
        [MaxLength(100)]
        public string Producer { get; set; }
        [Required]
        [Range(0, 4)]
        [XmlAttribute("category")]
        public int Category { get; set; }
    }
    //<Medicine category = "1" >
    //                < Name > Ibuprofen </ Name >
    //                < Price > 8.50 </ Price >
    //                < ProductionDate > 2022 - 02 - 10 </ ProductionDate >
    //                < ExpiryDate > 2025 - 02 - 10 </ ExpiryDate >
    //                < Producer > ReliefMed Labs</Producer>
    //			</Medicine>

}
