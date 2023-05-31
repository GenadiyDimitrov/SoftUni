
public class PredicateForNames : IRun
{
    public void Run()
    {
        int lenght = int.Parse(Console.ReadLine());
        string[] names = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries);
        Console.WriteLine(string.Join("\n", names.Where(n => n.Length <= lenght)));
    }
}