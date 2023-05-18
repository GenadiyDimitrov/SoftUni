
internal class SquaresInMatrix : IRun
{
    public void Run()
    {
        int[] rowsCols = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];

        string[][] matrix = new string[rows][];

        for (int row = 0; row < rows; row++)
        {
            matrix[row] = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .ToArray();
        }
        int squaresCount = 0;


        for (int row = 0; row < rows - 1; row++)
        {
            for (int col = 0; col < cols - 1; col++)
            {
                string value = matrix[row][col];
                if (
                    value.Equals(matrix[row][col + 1]) &&
                    value.Equals(matrix[row + 1][col]) &&
                    value.Equals(matrix[row + 1][col + 1])
                    )
                {
                    squaresCount++;
                }
            }
        }
        Console.WriteLine(squaresCount);
    }
}