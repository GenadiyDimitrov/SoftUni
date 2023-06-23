using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PizzaCalories
{

    internal class Dough : Ingredient
    {
        private double grainModifier;
        private double cookModifier;
        public Dough(string flourType, string bakingType, double grams) : base("Dough", grams, 200)
        {
            if (Modifiers.FlourType.TryGetValue(flourType.ToLower(), out var flour))
            {
                grainModifier = flour;
            }
            else
            {
                throw new InvalidDoughTypeException();
            }
            if (Modifiers.BakingType.TryGetValue(bakingType.ToLower(), out var baked))
            {
                cookModifier = baked;
            }
            else
            {
                throw new InvalidDoughTypeException();
            }
            SetModifier(cookModifier * grainModifier);
        }
    }
}
