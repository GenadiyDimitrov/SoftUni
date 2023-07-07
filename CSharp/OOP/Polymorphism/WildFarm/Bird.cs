using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal abstract class Bird : Animal
    {
        protected Bird(string name, double weight, double ws) : base(name, weight)
        {
            WingSize = ws;
        }

        public double WingSize { get; private set; }
        public override string ToString()
        {
            return $"{this.GetType().Name} [{Name}, {WingSize}, {Weight}, {FoodEaten}]";
        }
    }
}
