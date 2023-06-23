using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PizzaCalories
{
    public static class Modifiers
    {
        public static Dictionary<string, double> FlourType = new()
        {
            {"white",1.5 },
            {"wholegrain",1 }
        };
        public static Dictionary<string, double> BakingType = new()
        {
            {"crispy" ,0.9},
            {"chewy" ,1.1},
            {"homemade" ,1}
        };
        public static Dictionary<string, double> ToppingType = new()
        {
            {"meat" ,1.2},
            {"veggies" ,0.8},
            {"cheese" ,1.1},
            {"sauce" ,0.9}
        };
    }
}
