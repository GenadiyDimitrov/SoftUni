using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VechiclesExtension
{
    internal class Truck : Vehicle
    {
        protected override double AdditionalLitersPerKilometers { get; set; } = 1.6;
        public Truck(double fq, double lpkm, double tc) : base(fq, lpkm, tc)
        {

        }
        public override void Refuel(double amount)
        {
            if (amount + FuelQuantity > TankCapacity)
            {
                throw new ArgumentException($"Cannot fit {amount} fuel in the tank");
            }

            base.Refuel(amount * 0.95);
        }
    }
}
