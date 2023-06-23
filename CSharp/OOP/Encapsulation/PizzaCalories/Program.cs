namespace PizzaCalories
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Pizza pizza = null;
                string command = Console.ReadLine();
                while (!command.Equals("END"))
                {
                    string[] commandData = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);
                    switch (commandData[0])
                    {
                        case "Pizza":
                            if (pizza == null)
                            {
                                pizza = new(commandData[1]);
                            }
                            break;
                        case "Dough":
                            pizza.AddDough(commandData.Skip(1).ToArray());
                            break;
                        case "Topping":
                            pizza.AddTopping(commandData.Skip(1).ToArray());
                            break;
                    }
                    command = Console.ReadLine();
                }
                Console.WriteLine(pizza);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}