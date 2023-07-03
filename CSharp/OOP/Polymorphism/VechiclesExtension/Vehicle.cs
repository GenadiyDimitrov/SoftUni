using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VechiclesExtension
{
    public abstract class Vehicle
    {
        public double FuelQuantity { get; set; }
        public double LitersPerKilometers { get; set; }
        public double TankCapacity { get; set; }
        public Vehicle(double fq, double lpkm, double tc)
        {
            FuelQuantity = fq;
            LitersPerKilometers = lpkm;
            TankCapacity = tc;
        }
        public string Drive(double distance)
        {
            if (FuelQuantity < distance * LitersPerKilometers)
            {
                throw new ArgumentException($"{this.GetType().Name} needs refueling");
            }

            FuelQuantity -= distance * LitersPerKilometers;

            return $"{this.GetType().Name} travelled {distance} km";
        }
        public virtual void Refuel(double amount)
        {
            if (amount < 0)
            {
                throw new ArgumentException("Fuel must be a positive number");
            }
            FuelQuantity += amount;
        }

        public override string ToString()
            => $"{this.GetType().Name}: {FuelQuantity:F2}";
    }
}
