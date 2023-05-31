
public class FindEvenAndOdds : IRun
{
    Func<int, int, int[]> fillTheArrayFunc = (min, max) =>
    {
        List<int> list = new List<int>();
        for (int i = min; i <= max; i++)
        {
            list.Add(i);
        }
        return list.ToArray();
    };
    Func<int[], string, string> getResult = (arr, type) =>
    {
        List<int> list = new List<int>();
        switch (type.ToLower())
        {
            case "even":
                foreach (var item in arr)
                {
                    if (item % 2 == 0)
                    {
                        list.Add(item);
                    }
                }
                break;
            case "odd":
                foreach (var item in arr)
                {
                    if (item % 2 != 0)
                    {
                        list.Add(item);
                    }
                }
                break;
        }
        return string.Join(" ", list);
    };
    public void Run()
    {
        var arr = Console.ReadLine()
                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                    .Select(int.Parse)
                    .ToArray();

        Console.WriteLine
            (
                getResult(
                            fillTheArrayFunc(arr[0], arr[1]),
                            Console.ReadLine()
                         )
            );
    }
}