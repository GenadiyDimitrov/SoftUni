using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal class Tiger : Feline
    {
        private const double _gain = 1;
        protected override double Gain => _gain;
        private readonly Type[] _foodsRequierd = new Type[] { typeof(Meat) };

        public Tiger(string name, double weight, string livingRegion, string breed) : base(name, weight, livingRegion, breed)
        {
        }

        protected override Type[] FoodsRequired => _foodsRequierd;
        public override void AskForFood()
        {
            Console.WriteLine("ROAR!!!");
        }
    }
}
