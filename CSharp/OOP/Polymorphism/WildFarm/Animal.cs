using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal abstract class Animal
    {
        public Animal(string name, double weight)
        {
            Name = name;
            Weight = weight;
        }

        protected abstract Type[] FoodsRequired { get; }
        protected abstract double Gain { get; }
        public void TryFeed(Food food)
        {
            //if (!FoodsRequired.Contains(food.GetType()))
            if (!FoodsRequired.Any(fr => fr.Name == food.GetType().Name))
            {
                throw new ArgumentException($"{this.GetType().Name} does not eat {food.GetType().Name}!");
            }
            Weight += food.Quantity * Gain;
            FoodEaten += food.Quantity;
        }
        public abstract void AskForFood();
        public string Name { get; set; } = "";
        public double Weight { get; set; }
        public int FoodEaten { get; set; }
    }
}
