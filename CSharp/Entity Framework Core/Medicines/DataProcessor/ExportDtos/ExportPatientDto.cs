using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Medicines.DataProcessor.ExportDtos
{
    [XmlType("Patient")]
    public class ExportPatientDto
    {
        [XmlAttribute]
        public string Gender { get; set; }
        public string Name { get; set; }
        public string AgeGroup { get; set; }
        public ExportMedicineXmlDto[] Medicines { get; set; }
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
