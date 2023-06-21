internal class PeriodicTable : IRun
{
    public void Run()
    {
        int rows = int.Parse(Console.ReadLine());
        HashSet<string> unique = new HashSet<string>();
        for (int row = 0; row < rows; row++)
        {
            string[] elements = Console.ReadLine()
                                .Split(" ", StringSplitOptions.RemoveEmptyEntries);
            foreach (var element in elements)
            {
                unique.Add(element);
            }
        }
        Console.WriteLine(string.Join(" ", unique.OrderBy(x => x)));
    }
}
