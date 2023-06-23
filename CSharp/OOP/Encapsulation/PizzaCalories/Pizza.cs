using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PizzaCalories
{
    internal class Pizza
    {
        private Dough _dough = null;
        private List<Topping> _toppings;
        private int toppingslimit = 10;
        public Pizza(string name)
        {
            Name = name;
            _toppings = new();
        }

        private string _name;

        public string Name
        {
            get { return _name; }
            private set
            {
                if (value.Length < 1 || value.Length > 15)
                {
                    throw new ArgumentException("Pizza name should be between 1 and 15 symbols.");
                }
                _name = value;
            }
        }
        public override string ToString()
        {
            double totalCal = _dough.Calories + _toppings.Sum(t => t.Calories);

            return $"{Name} - {totalCal:F2} Calories.";
        }
        public void AddDough(string[] doughData)
        {
            if (_dough == null)
            {
                _dough = new(doughData[0], doughData[1], double.Parse(doughData[2]));
            }
        }
        public void AddTopping(string[] toppingData)
        {
            AddTopping(new Topping(toppingData[0], double.Parse(toppingData[1])));
        }
        private void AddTopping(Topping topping)
        {
            if (_toppings.Count >= toppingslimit)
            {
                throw new ArgumentException("Number of toppings should be in range [0..10].");
            }
            else
            {
                _toppings.Add(topping);
            }
        }

    }
}
