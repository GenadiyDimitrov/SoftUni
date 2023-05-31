using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Advanced.VI_DefiningClasses.Classes;

namespace DefiningClasses
{
    internal class RawData : IRun
    {
        public void Run()
        {
            int count = int.Parse(Console.ReadLine());
            List<Car> cars = new();
            for (int i = 0; i < count; i++)
            {
                string[] param = Console.ReadLine()
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries);

                string model = param[0];
                Engine engine = new(int.Parse(param[1]), int.Parse(param[2]));
                Cargo cargo = new(int.Parse(param[3]), param[4]);
                Tire[] tires = {
                new(double.Parse(param[5]),int.Parse(param[6])),
                new(double.Parse(param[7]), int.Parse(param[8])),
                new(double.Parse(param[9]), int.Parse(param[10])),
                new(double.Parse(param[11]), int.Parse(param[12]))
                };
                if ((cargo.Type == "fragile" && tires.Any(t => t.Pressure < 1)) || (cargo.Type == "flammable" && engine.Power > 250))
                {
                    cars.Add(new(model, engine, cargo, tires));
                }
            }
            string command = Console.ReadLine();
            Console.WriteLine(string.Join("\n",
                        cars.Where(c => c.Cargo.Type.Equals(command))
                            .Select(c => c.Model)
                ));
        }
    }
}
