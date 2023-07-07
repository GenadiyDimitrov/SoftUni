using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Raiding
{
    internal abstract class Fighter : BaseHero
    {
        protected Fighter(string name, int power) : base(name, power)
        {
        }

        public sealed override void CastAbility()
        {
            Console.WriteLine($"{this.GetType().Name} - {Name} hit for {Power} damage");
        }
    }
}
