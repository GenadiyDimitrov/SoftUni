﻿namespace Vehicles
{
    internal class Program
    {
        static List<Vehicle> Vehicles = new();
        static void Main(string[] args)
        {
            Vehicles.Add(CreateVehicle());
            Vehicles.Add(CreateVehicle());

            int rows = int.Parse(Console.ReadLine());
            for (int i = 0; i < rows; i++)
            {
                try
                {
                    ProcessCommand();
                }
                catch (ArgumentException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                catch (Exception)
                {
                    throw;
                }
            }

            foreach (var vehicle in Vehicles)
            {
                Console.WriteLine(vehicle.ToString());
            }
        }
        private static void ProcessCommand()
        {
            string[] commandTokens = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            string command = commandTokens[0];
            string vehicleType = commandTokens[1];

            Vehicle vehicle = Vehicles.FirstOrDefault(v => v.GetType().Name == vehicleType);

            if (vehicle == null)
            {
                throw new ArgumentException("Invalid vehicle type");
            }

            if (command == "Drive")
            {
                double distance = double.Parse(commandTokens[2]);
                Console.WriteLine(vehicle.Drive(distance));
            }
            else if (command == "Refuel")
            {
                double fuelAmount = double.Parse(commandTokens[2]);
                vehicle.Refuel(fuelAmount);
            }
        }


        private static Vehicle CreateVehicle()
        {
            string[] tokens = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            return Create(tokens[0], double.Parse(tokens[1]), double.Parse(tokens[2]));
        }
        public static Vehicle Create(string type, double fuelQuantity, double fuelConsumption)
        {
            switch (type)
            {
                case "Car":
                    return new Car(fuelQuantity, fuelConsumption);
                case "Truck":
                    return new Truck(fuelQuantity, fuelConsumption);
                default:
                    throw new ArgumentException("Invalid vehicle type");
            }
        }
    }
}