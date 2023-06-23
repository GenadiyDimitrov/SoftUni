using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShoppingSpree
{
    internal class Person
    {
        private string _name;
        private double _money;
        public Person(string name, double money)
        {
            Name = name;
            Money = money;
            _bag = new List<Product>();
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
        public double Money
        {
            get => _money;

            private set
            {
                if (value < 0)
                {
                    throw new MoneyNegativeException();
                }
                _money = value;
            }
        }
        private List<Product> _bag;
        public void TryBuy(Product product)
        {
            if (_money >= product.Cost)
            {
                Buy(product);
                Console.WriteLine($"{_name} bought {product.Name}");
            }
            else
            {
                Console.WriteLine($"{_name} can't afford {product.Name}");
            }
        }
        private void Buy(Product product)
        {
            _bag.Add(product);
            _money -= product.Cost;
        }

        public override string ToString()
        {
            if (_bag.Count > 0)
            {
                return $"{_name} - {string.Join(", ", _bag.Select(p => p.Name))}";
            }
            else
            {
                return $"{_name} - Nothing bought";
            }
        }
    }
}
