
public class AppliedArithmetics : IRun
{
    Func<int[], int[]> add = arr =>
    {
        int[] newArr = new int[arr.Length];
        return arr.Select(i => ++i).ToArray();
    };
    Func<int[], int[]> multiply = arr =>
    {
        return arr.Select(i => i * 2).ToArray();
    };
    Func<int[], int[]> subtract = arr =>
    {
        return arr.Select(i => --i).ToArray();
    };
    Action<int[]> print = arr =>
    {
        Console.WriteLine(string.Join(" ", arr));
    };
    public void Run()
    {
        var arr = Console.ReadLine()
                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                    .Select(int.Parse)
                    .ToArray();

        string command = Console.ReadLine().ToLower();
        while (!command.Equals("end"))
        {
            switch (command)
            {
                case "add":
                    arr = add(arr);
                    break;
                case "subtract":
                    arr = subtract(arr);
                    break;
                case "multiply":
                    arr = multiply(arr);
                    break;
                case "print":
                    print(arr);
                    break;
            }

            command = Console.ReadLine().ToLower();
        }
    }
}