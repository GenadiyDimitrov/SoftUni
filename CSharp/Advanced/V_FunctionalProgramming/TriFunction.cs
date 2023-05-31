internal class TriFunction : IRun
{
    Func<string, int, bool> CheckSizeGE = (name, size) =>
    {
        return name.ToCharArray().Select(s => (int)s).Sum() >= size;
    };
    Func<string, string[]> Split = input =>
    {
        return input.Split(" ", StringSplitOptions.RemoveEmptyEntries)
                    .ToArray();
    };
    Func<string, int> ToInt = input =>
    {
        return int.Parse(input);
    };
    Action<string> Print = input =>
    {
        Console.WriteLine(input);
    };
    public void Run()
    {
        int size = ToInt(Console.ReadLine());
        string[] arr = Split(Console.ReadLine());

        foreach (var name in arr)
        {
            if (CheckSizeGE(name, size))
            {
                Print(name);
                break;
            }
        }
    }
}