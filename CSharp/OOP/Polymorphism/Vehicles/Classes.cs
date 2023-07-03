using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Vehicles
{
    public abstract class Vehicle
    {
        public double FuelQuantity { get; set; }
        public double LitersPerKilometers { get; set; }
        public Vehicle(double fq, double lpkm)
        {
            FuelQuantity = fq;
            LitersPerKilometers = lpkm;
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
            => FuelQuantity += amount;

        public override string ToString()
            => $"{this.GetType().Name}: {FuelQuantity:F2}";
    }
    internal class Truck : Vehicle
    {
        private const double additionalFuelConsumption = 1.6;
        public Truck(double fq, double lpkm) : base(fq, lpkm + additionalFuelConsumption)
        {

        }
        public override void Refuel(double amount)
            => base.Refuel(amount * 0.95);
    }
    internal class Car : Vehicle
    {
        private const double additionalFuelConsumption = 0.9;
        public Car(double fq, double lpkm) : base(fq, lpkm + additionalFuelConsumption)
        {
        }
    }
}
