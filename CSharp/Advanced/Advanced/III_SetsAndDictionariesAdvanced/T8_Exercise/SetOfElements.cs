
internal class SetOfElements : IRun
{
    public void Run()
    {
        int[] setsLenght = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();

        List<int> firstSet = new();
        List<int> secondSet = new();

        for (int i = 0; i < setsLenght[0]; i++)
        {
            firstSet.Add(int.Parse(Console.ReadLine()));
        }
        for (int i = 0; i < setsLenght[1]; i++)
        {
            secondSet.Add(int.Parse(Console.ReadLine()));
        }

        var intersect = firstSet.Intersect(secondSet);
        Console.WriteLine(string.Join(" ", intersect));
    }
}