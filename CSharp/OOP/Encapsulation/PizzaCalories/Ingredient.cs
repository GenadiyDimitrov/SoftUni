using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace PizzaCalories
{
    internal class Ingredient
    {
        private const double _initialCalories = 2;
        private double _maxWeight;
        private double _modifier;
        private string _name;
        public Ingredient(string name, double weight, double maxWeight)
        {
            _name = name;
            _maxWeight = maxWeight;
            Weight = weight;
        }
        private double _weight;

        public double Weight
        {
            get { return _weight; }
            set
            {
                if (value < 0 || value > _maxWeight)
                {
                    throw new ArgumentException($"{_name} weight should be in the range [1..{_maxWeight:F0}].");
                }
                _weight = value;
            }
        }
        protected void SetModifier(double modifier)
        {
            _modifier = modifier;
        }
        public double Calories
        {
            get { return _initialCalories * _weight * _modifier; }
        }
    }
}
