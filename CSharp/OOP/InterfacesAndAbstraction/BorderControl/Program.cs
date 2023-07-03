namespace BorderControl
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> ids = new();
            string command = Console.ReadLine();
            while (!command.Equals("End"))
            {
                ids.Add(command.Split(" ", StringSplitOptions.RemoveEmptyEntries).Last());
                command = Console.ReadLine();
            }

            command = Console.ReadLine();

            foreach (var id in ids)
            {
                if (id.EndsWith(command))
                {
                    Console.WriteLine(id);
                }
            }
        }
    }
}