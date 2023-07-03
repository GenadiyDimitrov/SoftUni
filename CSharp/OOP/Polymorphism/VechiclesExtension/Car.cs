using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VechiclesExtension
{
    internal class Car : Vehicle
    {
        private const double additionalFuelConsumption = 0.9;
        public Car(double fq, double lpkm) : base(fq, lpkm + additionalFuelConsumption)
        {
        }
    }
}
