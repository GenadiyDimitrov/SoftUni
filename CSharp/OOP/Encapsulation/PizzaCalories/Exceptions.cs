using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PizzaCalories
{
    public class InvalidDoughTypeException : ArgumentException
    {
        public InvalidDoughTypeException() : base("Invalid type of dough.") { }
    }
}
