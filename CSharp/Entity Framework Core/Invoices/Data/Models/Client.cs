﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;

namespace Invoices.Data.Models
{
    public class Client
    {
        public Client()
        {
            Invoices = new HashSet<Invoice>();
            Addresses = new HashSet<Address>();
            ProductsClients = new HashSet<ProductClient>();

        }
        [Key]
        public int Id { get; set; }
        [Required]
        [MaxLength(25)]
        public string Name { get; set; }
        [Required]
        [MaxLength(15)]
        public string NumberVat { get; set; }

        public virtual ICollection<Invoice> Invoices { get; set; }
        public virtual ICollection<Address> Addresses { get; set; }
        public virtual ICollection<ProductClient> ProductsClients { get; set; }
    }
    //· Id – integer, Primary Key
    //· Name – text with length[10…25] (required)
    //· NumberVat – text with length[10…15] (required)
    //· Invoices – collection of type Invoicе
    //· Addresses – collection of type Address
    //· ProductsClients – collection of type ProductClient
}
