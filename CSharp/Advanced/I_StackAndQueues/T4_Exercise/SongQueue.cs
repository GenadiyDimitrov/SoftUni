
internal class SongQueue : IRun
{
    public void Run()
    {
        Queue<string> queue = new(
            Console.ReadLine()
                .Split(", ", StringSplitOptions.RemoveEmptyEntries)
            );
        while (queue.Count > 0)
        {
            string[] commandParameters = Console.ReadLine()
                                            .Split(" ", StringSplitOptions.RemoveEmptyEntries);
            switch (commandParameters[0])
            {
                case "Play":
                    queue.Dequeue();
                    break;
                case "Add":
                    string song = string.Join(" ", commandParameters[1..]);
                    if (queue.Contains(song))
                    {
                        Console.WriteLine($"{song} is already contained!");
                    }
                    else
                    {
                        queue.Enqueue(song);
                    }
                    break;
                case "Show":
                    Console.WriteLine(string.Join(", ", queue));
                    break;
            }
        }
        Console.WriteLine("No more songs!");
    }
}