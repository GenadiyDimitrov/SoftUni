﻿using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Medicines.DataProcessor.ExportDtos
{
    public class ExportMedicineJsonDto
    {
        public string Name { get; set; }
        public string Price { get; set; }
        public ExportPharmecyDto Pharmacy { get; set; }

        [JsonIgnore]
        public decimal PriceDecimal;
    }
    //    "Name": "Clindamycin",
    //"Price": "15.30",
    //"Pharmacy": {
    //  "Name": "Revive",
    //  "PhoneNumber": "(654) 987-0123"
}
