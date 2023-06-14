using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    public class Car
    {
        string _model = "NaN";
        string _color = "";
        int? _weight = null;
        double _fuelAmount = 0;
        double _fuelConsumptionPerKilometer = 0;
        double _travelledDistance = 0;
        public Car() { }
        public Car(string model)
        {
            Model = model;
        }
        public Car(string model, double amount, double consumption) : this(model)
        {
            FuelAmount = amount;
            FuelConsumptionPerKilometer = consumption;
        }
        public Car(string model, Engine engine, Cargo cargo, Tire[] tires) : this(model)
        {
            Engine = engine;
            Cargo = cargo;
            Tires = tires;
        }
        public Tire[] Tires { get; set; }
        public Engine Engine { get; set; }
        public Cargo Cargo { get; set; }
        public string Model
        {
            get
            {
                return _model;
            }
            set
            {
                _model = value;
            }
        }
        public string Color
        {
            get
            {
                return _color;
            }
            set
            {
                _color = value;
            }
        }
        public int? Weight
        {
            get
            {
                return _weight;
            }
            set
            {
                _weight = value;
            }
        }
        public double FuelAmount
        {
            get
            {
                return _fuelAmount;
            }
            set
            {
                _fuelAmount = value;
            }
        }
        public double FuelConsumptionPerKilometer
        {
            get { return _fuelConsumptionPerKilometer; }
            set
            {
                _fuelConsumptionPerKilometer = value;
            }
        }
        public double TravelledDistance
        {
            get
            {
                return _travelledDistance;
            }
            set
            {
                _travelledDistance = value;
            }
        }

        public void Drive(double distance)
        {
            double fuelLeft = FuelAmount - FuelConsumptionPerKilometer * distance;
            if (fuelLeft >= 0)
            {
                FuelAmount = fuelLeft;
                TravelledDistance += distance;
            }
            else
            {
                Console.WriteLine("Insufficient fuel for the drive");
            }
        }
        public void UpdateData(double amount, double consumption)
        {
            FuelAmount = amount;
            FuelConsumptionPerKilometer = consumption;
        }

        public override string ToString()
        {
            return
                $"{Model}:\n" +
                $" {Engine.Model}:\n" +
                $"  Power: {Engine.Power}\n" +
                $"  Displacement: {(Engine.Displacement != null ? $"{Engine.Displacement}" : "n/a")}\n" +
                $"  Efficiency: {(Engine.Efficiency != string.Empty ? Engine.Efficiency : "n/a")}\n" +
                $" Weight: {(Weight != null ? $"{Weight}" : "n/a")}\n" +
                $" Color: {(Color != string.Empty ? Color : "n/a")}";
        }
    }
}
