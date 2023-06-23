using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShoppingSpree
{
    internal class Product
    {
        private string _name;
        private double _price;

        public Product(string name, double price)
        {
            Name = name;
            Cost = price;
        }
        public string Name
        {
            get => _name;

            private set
            {
                if (string.IsNullOrWhiteSpace(value))
                {
                    throw new InvalidNameException();
                }
                _name = value;
            }
        }
        public double Cost
        {
            get => _price;

            private set
            {
                if (value < 0)
                {
                    throw new MoneyNegativeException();
                }
                _price = value;
            }
        }
    }
}
