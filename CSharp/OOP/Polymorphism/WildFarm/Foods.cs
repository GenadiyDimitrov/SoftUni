using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WildFarm
{
    internal abstract class Food
    {
        public Food(int quantity)
        {
            Quantity = quantity;
        }

        public int Quantity { get; set; }
    }
    internal class Vegetable : Food
    {
        public Vegetable(int quantity) : base(quantity)
        {
        }
    }
    internal class Fruit : Food
    {
        public Fruit(int quantity) : base(quantity)
        {
        }
    }
    internal class Meat : Food
    {
        public Meat(int quantity) : base(quantity)
        {
        }
    }
    internal class Seeds : Food
    {
        public Seeds(int quantity) : base(quantity)
        {
        }
    }
}
