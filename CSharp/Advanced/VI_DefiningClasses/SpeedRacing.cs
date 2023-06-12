using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    public class SpeedRacing : IRun
    {
        public void Run()
        {
            Dictionary<string, Car> Cars = new();
            int cars = int.Parse(Console.ReadLine());
            for (int i = 0; i < cars; i++)
            {
                string[] param = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);
                string model = param[0];
                double fuelAmount = double.Parse(param[1]);
                double consumption = double.Parse(param[2]);
                if (Cars.TryGetValue(model, out var car))
                {
                    car.UpdateData(fuelAmount, consumption);
                }
                else
                {
                    Cars.Add(model, new(model, fuelAmount, consumption));
                }
            }

            string command = Console.ReadLine();
            while (!command.Equals("End"))
            {
                string[] param = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);
                if (param[0] == "Drive")
                {
                    if (Cars.TryGetValue(param[1], out var car))
                    {
                        if (double.TryParse(param[2], out var distance))
                        {
                            car.Drive(distance);
                        }
                    }
                }
                command = Console.ReadLine();
            }

            foreach (var car in Cars.Values)
            {
                Console.WriteLine($"{car.Model} {car.FuelAmount:F2} {car.TravelledDistance}");
            }
        }
    }
}
