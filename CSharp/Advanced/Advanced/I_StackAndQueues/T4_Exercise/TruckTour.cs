internal class TruckTour : IRun
{
    public void Run()
    {
        int numberOfPump = int.Parse(Console.ReadLine());

        Queue<int> pumps = new();
        for (int i = 0; i < numberOfPump; i++)
        {
            int[] input = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToArray();
            pumps.Enqueue(input[0] - input[1]);
        }

        int pumpName = -1;
        bool exit = false;
        while (!exit)
        {
            exit = true;
            pumpName++;
            int fuel = 0;
            Queue<int> progress = new(pumps);
            while (progress.Any())
            {
                fuel += progress.Dequeue();
                if (fuel < 0)
                {
                    exit = false;
                    break;
                }
            }
            pumps.Enqueue(pumps.Dequeue());
        }
        Console.WriteLine(pumpName);
    }
}