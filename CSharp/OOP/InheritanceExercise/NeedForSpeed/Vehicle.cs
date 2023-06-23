using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NeedForSpeed
{
    internal class Vehicle
    {
        private double DefaultFuelConsumption;
        public virtual double FuelConsumption { get; set; }
        public double Fuel { get; set; }
        public int HorsePower { get; set; }
        public Vehicle(int horsePower, double fuel)
        {
            UpdateFuelConsumption(1.25);
            HorsePower = horsePower;
            Fuel = fuel;
        }
        protected void UpdateFuelConsumption(double fc)
        {
            DefaultFuelConsumption = fc;
            FuelConsumption = DefaultFuelConsumption;
        }
        public virtual void Drive(double kilometers)
        {
            Fuel -= kilometers * FuelConsumption;
        }
    }
}
