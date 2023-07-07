using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Raiding
{
    internal interface IHero
    {
        string Name { get; set; }
        int Power { get; set; }
        void CastAbility();
    }
    internal abstract class BaseHero : IHero
    {
        protected BaseHero(string name, int power)
        {
            Name = name;
            Power = power;
        }
        public string Name { get; set; }
        public int Power { get; set; }
        public abstract void CastAbility();
    }
}
