using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NeedForSpeed
{
    internal class RaceMotorcycle : Motorcycle
    {
        public RaceMotorcycle(int hp, double f) : base(hp, f)
        {
            UpdateFuelConsumption(8);
        }
    }
}
