using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VechiclesExtension
{
    internal class Truck : Vehicle
    {
        private const double additionalFuelConsumption = 1.6;
        public Truck(double fq, double lpkm) : base(fq, lpkm + additionalFuelConsumption)
        {

        }
        public override void Refuel(double amount)
            => base.Refuel(amount * 0.95);
    }
}
