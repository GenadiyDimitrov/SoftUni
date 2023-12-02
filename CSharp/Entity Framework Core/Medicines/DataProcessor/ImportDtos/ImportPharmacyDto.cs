using Medicines.Data.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Medicines.DataProcessor.ImportDtos
{
    [XmlType("Pharmacy")]
    public class ImportPharmacyDto
    {
        [Required]
        [MinLength(2)]
        [MaxLength(50)]
        public string Name { get; set; }
        [Required]
        [MinLength(14)]
        [MaxLength(14)]
        [RegularExpression(@"(\([0-9]{3}\) [0-9]{3}-[0-9]{4})")]
        public string PhoneNumber { get; set; }
        [XmlArray]
        public ImportMedicineDto[] Medicines { get; set; }

        [XmlAttribute("non-stop")]
        public string IsNonStop { get; set; }
    }
    //	<Pharmacy non-stop="true">
    //		<Name>Vitality</Name>
    //		<PhoneNumber>(123) 456-7890</PhoneNumber>
    //		<Medicines>
    //			
    //                 ...
    //      </Pharmacy>

}
