
internal class BasicStackOperations : IRun
{
    public void Run()
    {
        int[] data = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int count = data[0];
        int pop = data[1];
        int lookFor = data[2];
        Stack<int> numbers = new Stack<int>(Console.ReadLine().Split().Select(int.Parse));
        for (int i = 0; i < pop && numbers.Any(); i++)
        {
            numbers.Pop();
        }
        int? min = null;
        while (numbers.Any())
        {
            int popped = numbers.Pop();
            if (popped == lookFor)
            {
                Console.WriteLine("true");
                return;
            }
            else if (min > popped || min == null)
            {
                min = popped;
            }
        }
        Console.WriteLine(min ?? 0);
    }
}
