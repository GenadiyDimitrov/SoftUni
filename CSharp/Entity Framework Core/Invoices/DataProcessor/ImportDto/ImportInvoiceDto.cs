using Invoices.Data.Models.Enums;
using Invoices.Data.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.Json.Serialization;

namespace Invoices.DataProcessor.ImportDto
{
    public class ImportInvoiceDto
    {
        [Required]
        [Range(1000000000, 1500000000)]
        public int Number { get; set; }
        [Required]
        public DateTime IssueDate { get; set; }
        [Required]
        public DateTime DueDate { get; set; }
        [Required]
        public decimal Amount { get; set; }
        [Required]
        [EnumDataType(typeof(CurrencyType))]
        public CurrencyType CurrencyType { get; set; }
        [Required]
        public int ClientId { get; set; }
    }
    //· Number – integer in range[1, 000, 000, 000…1, 500, 000, 000] (required)
}
