using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal class Hen : Bird
    {
        private const double _gain = 0.35;
        protected override double Gain => _gain;
        private readonly Type[] _foodsRequierd = new Type[] { typeof(Vegetable), typeof(Fruit), typeof(Meat), typeof(Seeds) };

        public Hen(string name, double weight, double ws) : base(name, weight, ws)
        {
        }

        protected override Type[] FoodsRequired => _foodsRequierd;
        public override void AskForFood()
        {
            Console.WriteLine("Cluck");
        }
    }
}
