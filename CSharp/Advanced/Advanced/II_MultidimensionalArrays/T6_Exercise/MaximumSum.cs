
internal class MaximumSum : IRun
{
    public void Run()
    {
        int[] rowsCols = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];

        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++)
        {
            matrix[row] = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();
        }
        int maximumSum = -1;
        int[][] maxMatrix = new int[3][];

        for (int row = 0; row < rows - 2; row++)
        {
            for (int col = 0; col < cols - 2; col++)
            {
                int curentSum = 0;
                //innerMatrix
                for (int iRow = 0; iRow < 3; iRow++)
                {
                    for (int iCol = 0; iCol < 3; iCol++)
                    {
                        curentSum += matrix[row + iRow][col + iCol];
                    }
                }
                if (maximumSum < curentSum)
                {
                    maximumSum = curentSum;

                    for (int iRow = 0; iRow < 3; iRow++)
                    {
                        maxMatrix[iRow] = new int[3];
                        for (int iCol = 0; iCol < 3; iCol++)
                        {
                            maxMatrix[iRow][iCol] = matrix[row + iRow][col + iCol];
                        }
                    }
                }
            }
        }
        Console.WriteLine($"Sum = {maximumSum}");
        foreach (var row in maxMatrix)
        {
            Console.WriteLine(string.Join(" ", row));

        }
    }
}