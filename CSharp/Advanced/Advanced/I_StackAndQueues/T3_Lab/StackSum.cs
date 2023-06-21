internal class StackSum : IRun
{
    public void Run()
    {
        Stack<int> numbers = new Stack<int>(Console.ReadLine().Split().Select(int.Parse));
        string[] commandParametars = Console.ReadLine().ToLower().Split();

        while (!commandParametars[0].Equals("end"))
        {
            if (commandParametars[0].Equals("add"))
            {
                for (int i = 1; i < commandParametars.Length; i++)
                {
                    numbers.Push(int.Parse(commandParametars[i]));
                }
            }
            else if (commandParametars[0].Equals("remove"))
            {
                int n = int.Parse(commandParametars[1]);
                if (n < numbers.Count)
                {
                    for (int i = 0; i < n; i++)
                    {
                        numbers.Pop();
                    }
                }
            }
            commandParametars = Console.ReadLine().ToLower().Split();
        }
        Console.WriteLine($"Sum: {numbers.Sum()}");
    }
}