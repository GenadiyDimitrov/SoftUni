using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ShoppingSpree
{
    public class InvalidNameException : ArgumentException
    {
        public InvalidNameException() : base("Name cannot be empty")
        {
        }
    }
    public class MoneyNegativeException : ArgumentException
    {
        public MoneyNegativeException() : base("Money cannot be negative")
        {
        }
    }
}
