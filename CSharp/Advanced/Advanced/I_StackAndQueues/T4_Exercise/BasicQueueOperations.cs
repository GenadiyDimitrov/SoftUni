
internal class BasicQueueOperations : IRun
{
    public void Run()
    {
        int[] data = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int enqueue = data[0];
        int dequeue = data[1];
        int lookFor = data[2];
        if (enqueue > dequeue)
        {
            Queue<int> numbers = new Queue<int>(Console.ReadLine().Split().Select(int.Parse));
            for (int i = 0; i < dequeue && numbers.Any(); i++)
            {
                numbers.Dequeue();
            }
            int min = int.MaxValue;
            while (numbers.Any())
            {
                int dequeued = numbers.Dequeue();
                if (dequeued == lookFor)
                {
                    Console.WriteLine("true");
                    return;
                }
                else if (min > dequeued)
                {
                    min = dequeued;
                }
            }
            Console.WriteLine(min);
        }
        else
        {
            Console.WriteLine(0);
        }
    }
}
