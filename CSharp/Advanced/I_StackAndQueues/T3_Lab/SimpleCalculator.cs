
internal class SimpleCalculator : IRun
{
    public void Run()
    {
        var items = new Stack<string>(Console.ReadLine().Split().Reverse());
        int sum = int.Parse(items.Pop());
        while (items.Any())
        {
            string sign = items.Pop();
            int secondNumber = int.Parse(items.Pop());
            if (sign == "+")
            {
                sum += secondNumber;
            }
            else if (sign == "-")
            {
                sum -= secondNumber;
            }

        }
        Console.WriteLine(sum);
    }
}
