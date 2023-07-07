using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VechiclesExtension
{
    internal class Bus : Vehicle
    {
        protected override double AdditionalLitersPerKilometers { get; set; } = 1.4;
        public Bus(double fq, double lpkm, double tc) : base(fq, lpkm, tc)
        {
        }
    }
}
