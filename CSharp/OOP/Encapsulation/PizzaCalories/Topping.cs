using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace PizzaCalories
{
    internal class Topping : Ingredient
    {
        public Topping(string type, double grams) : base(type, grams, 50)
        {
            if (Modifiers.ToppingType.TryGetValue(type.ToLower(), out var modifier))
            {
                SetModifier(modifier);
            }
            else
            {
                throw new ArgumentException($"Cannot place {type} on top of your pizza.");
            }
        }
    }
}
