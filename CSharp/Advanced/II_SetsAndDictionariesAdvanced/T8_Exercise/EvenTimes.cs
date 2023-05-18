internal class EvenTimes : IRun
{
    public void Run()
    {

        int rows = int.Parse(Console.ReadLine());
        Dictionary<int, int> numbers = new Dictionary<int, int>();
        for (int row = 0; row < rows; row++)
        {
            int number = int.Parse(Console.ReadLine());
            if (!numbers.ContainsKey(number))
            {
                numbers[number] = 0;
            }
            numbers[number]++;
        }

        foreach (var numberKvP in numbers)
        {
            if (numberKvP.Value % 2 == 0)
            {
                Console.WriteLine(numberKvP.Key);
                break;
            }
        }
    }
}