using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.ConstrainedExecution;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    internal class CarSalesman : IRun
    {
        public void Run()
        {
            int count = int.Parse(Console.ReadLine());
            Dictionary<string, Engine> engines = new();
            for (int i = 0; i < count; i++)
            {
                string[] param = Console.ReadLine().Split(" ");
                Engine engine = new(param[0], int.Parse(param[1]));
                if (param.Length > 2)
                {
                    if (int.TryParse(param[2], out var displacement))
                    {
                        engine.Displacement = displacement;
                    }
                    else if (param[2] != string.Empty)
                    {
                        engine.Efficiency = param[2];
                    }
                }
                if (param.Length > 3)
                {
                    if (param[3] != string.Empty)
                    {
                        engine.Efficiency = param[3];
                    }
                }

                engines.Add(engine.Model, engine);
            }
            List<Car> cars = new();
            count = int.Parse(Console.ReadLine());
            for (int i = 0; i < count; i++)
            {
                string[] param = Console.ReadLine().Split(" ");
                Car car = new(param[0]);
                if (engines.TryGetValue(param[1], out var engine))
                {
                    car.Engine = engine;
                }

                if (param.Length > 2)
                {
                    if (int.TryParse(param[2], out var weight))
                    {
                        car.Weight = weight;
                    }
                    else if (param[2] != string.Empty)
                    {
                        car.Color = param[2];
                    }
                }
                if (param.Length > 3)
                {
                    if (param[3] != string.Empty)
                    {
                        car.Color = param[3];
                    }
                }

                cars.Add(car);
            }

            foreach (var car in cars)
            {
                Console.WriteLine(car);
            }
        }
    }
}
