namespace FoodShortage
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> rebels = new();
            List<string> citizens = new();

            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                string[] data = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);
                string name = data[0];
                string info = data.Last();
                if (info.Contains("/"))
                {
                    citizens.Add(name);
                }
                else
                {
                    rebels.Add(name);
                }
            }

            string command = Console.ReadLine();
            int count = 0;
            while (!command.Equals("End"))
            {
                if (citizens.Contains(command))
                {
                    count += 10;
                }
                else if (rebels.Contains(command))
                {
                    count += 5;
                }
                command = Console.ReadLine();
            }
            Console.WriteLine(count);
        }
    }
}