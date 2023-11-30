using System.Text.Json.Serialization;
using System.Xml.Serialization;

namespace Invoices.DataProcessor.ExportDto
{
    [XmlType("Client")]
    public class ExportClientsDto
    {
        [XmlElement("ClientName")]
        public string Name { get; set; }
        [XmlElement("VatNumber")]
        public string NumberVat { get; set; }
        [JsonIgnore]
        [XmlAttribute("InvoicesCount")]
        public int InvoicesCount { get; set; }

        [JsonIgnore]
        public ExportInvoiceDto[] Invoices { get; set; }
    }

}
