
public class KnightsOfHonor : IRun
{
    public void Run()
    {
        Action<string[], string> printAction = (arr, title) =>
        {
            foreach (var name in arr)
            {
                Console.WriteLine($"{title} {name}");
            }
        };

        string[] arr = Console.ReadLine()
                        .Split(" ", StringSplitOptions.RemoveEmptyEntries);

        printAction(arr, "Sir");
    }
}