
public class ReverseAndExclude : IRun
{
    Func<int[], int, int[]> reverseAndExclude = (arr, devider) =>
    {
        List<int> newCollection = new List<int>();
        newCollection = arr.Reverse().ToList();
        for (int i = 0; i < newCollection.Count; i++)
        {
            if (newCollection[i] % devider == 0)
            {
                newCollection.RemoveAt(i);
                i--;
            }
        }
        return newCollection.ToArray();
    };

    public void Run()
    {
        var arr = Console.ReadLine()
                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                    .Select(int.Parse)
                    .ToArray();
        var devider = int.Parse(Console.ReadLine());
        Console.WriteLine(string.Join(" ", reverseAndExclude(arr, devider)));
    }
}