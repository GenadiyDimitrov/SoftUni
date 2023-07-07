using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal class Owl : Bird
    {
        private const double _gain = 0.25;
        protected override double Gain => _gain;
        private readonly Type[] _foodsRequierd = new Type[] { typeof(Meat) };

        public Owl(string name, double weight, double ws) : base(name, weight, ws)
        {
        }

        protected override Type[] FoodsRequired => _foodsRequierd;

        public override void AskForFood()
        {
            Console.WriteLine("Hoot Hoot");
        }
    }
}
