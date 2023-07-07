using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal class Dog : Mammal
    {
        private const double _gain = 0.4;
        protected override double Gain => _gain;
        private readonly Type[] _foodsRequierd = new Type[] { typeof(Meat) };

        public Dog(string name, double weight, string livingRegion) : base(name, weight, livingRegion)
        {
        }

        protected override Type[] FoodsRequired => _foodsRequierd;
        public override void AskForFood()
        {
            Console.WriteLine("Woof!");
        }
    }
}
