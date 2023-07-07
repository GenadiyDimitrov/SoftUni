using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VechiclesExtension
{
    internal class Car : Vehicle
    {
        protected override double AdditionalLitersPerKilometers { get; set; } = 0.9;
        public Car(double fq, double lpkm, double tc) : base(fq, lpkm, tc)
        {
        }

    }
}
