
internal class MaximumAndMinimumElement : IRun
{
    public void Run()
    {
        int numberOfRows = int.Parse(Console.ReadLine());
        Stack<int> numbers = new();
        for (int i = 0; i < numberOfRows; i++)
        {
            int[] commandParameters = Console.ReadLine()
                                         .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                         .Select(int.Parse)
                                         .ToArray();
            switch (commandParameters[0])
            {
                case 1:
                    numbers.Push(commandParameters[1]);
                    break;
                case 2:
                    numbers.Pop();
                    break;
                case 3:
                    if (numbers.Any())
                    {
                        Console.WriteLine(numbers.Max());
                    }
                    break;
                case 4:
                    if (numbers.Any())
                    {
                        Console.WriteLine(numbers.Min());
                    }
                    break;
            }
        }
        Console.WriteLine(string.Join(", ", numbers));
    }
}