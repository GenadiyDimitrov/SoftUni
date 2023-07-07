using System.Reflection.PortableExecutable;

namespace WildFarm
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Animal> animals = new List<Animal>();

            string command;
            while (!(command = Console.ReadLine()).Equals("End"))
            {
                Animal animal = null;
                try
                {
                    string[] data = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);
                    animal = GetAnimal(data);

                    data = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);
                    Food food = GetFood(data);

                    animal.AskForFood();
                    animal.TryFeed(food);
                }
                catch (ArgumentException ex)
                {
                    Console.WriteLine(ex.Message);
                }
                catch (Exception)
                {
                    throw;
                }
                animals.Add(animal);
            }
            foreach (var animal in animals)
            {
                Console.WriteLine(animal);
            }
        }
        static Animal GetAnimal(params string[] animalData)
        {
            string type = animalData[0];
            string name = animalData[1];
            double weight = double.Parse(animalData[2]);

            return type switch
            {
                //Felines
                "Cat" => new Cat(name, weight, animalData[3], animalData[4]),
                "Tiger" => new Tiger(name, weight, animalData[3], animalData[4]),
                //Birds
                "Owl" => new Owl(name, weight, double.Parse(animalData[3])),
                "Hen" => new Hen(name, weight, double.Parse(animalData[3])),
                //Mammals
                "Mouse" => new Mouse(name, weight, animalData[3]),
                "Dog" => new Dog(name, weight, animalData[3]),
                //Default
                _ => throw new ArgumentException("Invalid animal type!"),
            };
        }
        static Food GetFood(params string[] foodData)
        {
            string type = foodData[0];
            int quantity = int.Parse(foodData[1]);

            return type switch
            {
                "Vegetable" => new Vegetable(quantity),
                "Fruit" => new Fruit(quantity),
                "Meat" => new Meat(quantity),
                "Seeds" => new Seeds(quantity),
                //Default
                _ => throw new ArgumentException("Invalid food type!"),
            };
        }
    }
}