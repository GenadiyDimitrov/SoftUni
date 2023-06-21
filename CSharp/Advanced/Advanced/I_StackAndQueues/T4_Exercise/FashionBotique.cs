
internal class FashionBotique : IRun
{
    public void Run()
    {
        Stack<int> clothes = new(
            Console.ReadLine()
                .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                .Select(int.Parse)
            );
        int limit = int.Parse(Console.ReadLine());
        int numberOfRacks = 1;
        int currentLimit = limit;
        while (clothes.Any())
        {
            currentLimit -= clothes.Peek();
            if (currentLimit < 0)
            {
                currentLimit = limit;
                numberOfRacks++;
                continue;
            }
            clothes.Pop();
        }
        Console.WriteLine(numberOfRacks);
    }
}