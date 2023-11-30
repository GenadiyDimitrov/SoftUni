using Invoices.Data.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Invoices.DataProcessor.ImportDto
{
    [XmlType("Client")]
    public class ImportClientDto
    {
        [Required]
        [MaxLength(25)]
        [MinLength(10)]
        public string Name { get; set; }

        [Required]
        [MaxLength(15)]
        [MinLength(10)]
        public string NumberVat { get; set; }

        public ImportAddressDto[] Addresses { get; set; }

    }
}
//· Name – text with length[10…25] (required)
//· NumberVat – text with length[10…15] (required)
//  <Client>
//    <Name>LiCB</Name>
//    <NumberVat>BG5464156654654654</NumberVat>
//    <Addresses>
//    </Addresses>
//  </Client>
//}
