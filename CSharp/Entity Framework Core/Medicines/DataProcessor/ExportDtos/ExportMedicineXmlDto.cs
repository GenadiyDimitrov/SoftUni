using System.Xml.Serialization;

namespace Medicines.DataProcessor.ExportDtos
{
    [XmlType("Medicine")]
    public class ExportMedicineXmlDto
    {
        [XmlAttribute]
        public string Category { get; set; }
        public string Name { get; set; }
        public string Price { get; set; }
        public string Producer { get; set; }
        public string BestBefore { get; set; }


        [XmlIgnore]
        public decimal PriceDecimal { get; set; }
        [XmlIgnore]
        public DateTime BestBeforeDateTime { get; set; }
    }
    //    <Patient Gender="male">
    //    <Name>Stanimir Pavlov</Name>
    //    <AgeGroup>Adult</AgeGroup>
    //    <Medicines>
    //      <Medicine Category="antibiotic">
    //        <Name>Aleve (Naproxen)</Name>
    //        <Price>10.50</Price>
    //        <Producer>HealthCare Pharma</Producer>
    //        <BestBefore>2025-09-01</BestBefore>
    //      </Medicine>
    //      <Medicine Category="antiseptic">
    //        <Name>Ciprofloxacin</Name>
    //        <Price>19.20</Price>
    //        <Producer>ReliefMed Labs</Producer>
    //        <BestBefore>2025-07-22</BestBefore>
    //      </Medicine>                
    //…
    //    </Medicines>
    //  </Patient>

}
