using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace Invoices.Data.Models
{
    public class ProductClient
    {
        [Required]
        public int ProductId { get; set; }
        [ForeignKey(nameof(ProductId))]
        public Product Product { get; set; }
        [Required]
        public int ClientId { get; set; }
        [ForeignKey(nameof(ClientId))]
        public Client Client { get; set; }
    }
    //· ProductId – integer, Primary Key, foreign key(required)
    //· Product – Product
    //· ClientId – integer, Primary Key, foreign key(required)
    //· Client – Client
}