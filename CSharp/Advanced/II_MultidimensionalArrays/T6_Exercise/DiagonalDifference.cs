
internal class DiagonalDifference : IRun
{
    public void Run()
    {
        int size = int.Parse(Console.ReadLine());
        int[][] matrix = new int[size][];
        for (int i = 0; i < size; i++)
        {
            matrix[i] = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();
        }
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int row = 0; row < size; row++)
        {
            firstDiagonalSum += matrix[row][row];
            secondDiagonalSum += matrix[row][size - row - 1];
        }
        Console.WriteLine(Math.Abs(firstDiagonalSum - secondDiagonalSum));
    }
}