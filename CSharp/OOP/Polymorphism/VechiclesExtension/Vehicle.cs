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
        protected abstract double AdditionalLitersPerKilometers { get; set; }
        public double TankCapacity { get; set; }
        public Vehicle(double fq, double lpkm, double tc)
        {
            LitersPerKilometers = lpkm;
            TankCapacity = tc;
            FuelQuantity = fq > TankCapacity ? 0 : fq;
        }
        public string Drive(double distance, bool empty = false)
        {
            double lpkm = LitersPerKilometers + (empty ? 0 : AdditionalLitersPerKilometers);
            if (FuelQuantity < distance * lpkm)
            {
                throw new ArgumentException($"{this.GetType().Name} needs refueling");
            }

            FuelQuantity -= distance * lpkm;

            return $"{this.GetType().Name} travelled {distance} km";
        }
        public virtual void Refuel(double amount)
        {
            if (amount <= 0)
            {
                throw new ArgumentException("Fuel must be a positive number");
            }
            if (FuelQuantity + amount > TankCapacity)
            {
                throw new ArgumentException($"Cannot fit {amount} fuel in the tank");
            }
            FuelQuantity += amount;
        }

        public override string ToString()
            => $"{this.GetType().Name}: {FuelQuantity:F2}";
    }
}
