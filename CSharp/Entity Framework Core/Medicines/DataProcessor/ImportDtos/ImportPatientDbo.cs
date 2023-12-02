﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Medicines.DataProcessor.ImportDtos
{
    public class ImportPatientDbo
    {
        [Required]
        [MinLength(5)]
        [MaxLength(100)]
        public string FullName { get; set; }
        [Required]
        [Range(0, 2)]
        public int AgeGroup { get; set; }
        [Required]
        [Range(0, 1)]
        public int Gender { get; set; }
        public int[] Medicines { get; set; }
    }
    //"FullName": "Ivan Petrov",
    //"AgeGroup": "1",
    //"Gender": "0",
    //"Medicines": [
    //  15,
    //  23
    //]

}
