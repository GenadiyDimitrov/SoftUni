
public class ListOfPredicates : IRun
{
    Func<int[], int, bool> allDevisible = (arr, num) =>
    {
        return arr.All(n => num % n == 0);
    };
    public void Run()
    {
        int end = int.Parse(Console.ReadLine());
        int[] nums = Console.ReadLine()
                        .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                        .Select(int.Parse)
                        .ToArray();

        List<int> result = new List<int>();
        for (int i = 1; i <= end; i++)
        {
            if (allDevisible(nums, i))
            {
                result.Add(i);
            }
        }
        Console.WriteLine(string.Join(" ", result));
    }
}