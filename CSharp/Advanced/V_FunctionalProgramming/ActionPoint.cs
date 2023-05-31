
public class ActionPoint : IRun
{
    public void Run()
    {
        Action<string[]> printAction = arr =>
        {
            Console.WriteLine(string.Join("\n", arr));
        };

        string[] arr = Console.ReadLine()
                        .Split(" ", StringSplitOptions.RemoveEmptyEntries);

        printAction(arr);
    }
}