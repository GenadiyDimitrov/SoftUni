
public class CustomMinFunction : IRun
{
    Func<IEnumerable<int>, int> minFunc = arr =>
    {
        int result = int.MaxValue;
        foreach (var item in arr)
        {
            if (result > item)
            {
                result = item;
            }
        }
        return result;
    };
    public void Run()
    {
        var arr = Console.ReadLine()
                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                    .Select(int.Parse);

        var result = minFunc(arr);

        Console.WriteLine(result);
    }
}