namespace ShoppingSpree
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Dictionary<string, Person> Persons = GeneratePersons(Console.ReadLine());
                Dictionary<string, Product> Products = GenerateProducts(Console.ReadLine());

                string command = Console.ReadLine();
                while (!command.Equals("END"))
                {
                    string[] commandParam = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);
                    if (Persons.TryGetValue(commandParam[0], out Person person))
                    {
                        if (Products.TryGetValue(commandParam[1], out Product product))
                        {
                            person.TryBuy(product);
                        }
                    }

                    command = Console.ReadLine();
                }

                foreach (Person person in Persons.Values)
                {
                    Console.WriteLine(person);
                }
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }

        }
        static Dictionary<string, Person> GeneratePersons(string data)
        {
            Dictionary<string, Person> result = new();
            foreach (var personData in data.Split(";", StringSplitOptions.RemoveEmptyEntries))
            {
                string[] personParams = personData.Split("=");
                string name = personParams[0];
                double money = double.Parse(personParams[1]);
                Person person = new(name, money);
                result.Add(name, person);
            }
            return result;
        }
        static Dictionary<string, Product> GenerateProducts(string data)
        {
            Dictionary<string, Product> result = new();
            foreach (var productData in data.Split(";", StringSplitOptions.RemoveEmptyEntries))
            {
                string[] productParams = productData.Split("=");
                string name = productParams[0];
                double cost = double.Parse(productParams[1]);
                Product product = new(name, cost);
                result.Add(name, product);
            }
            return result;
        }
    }
}