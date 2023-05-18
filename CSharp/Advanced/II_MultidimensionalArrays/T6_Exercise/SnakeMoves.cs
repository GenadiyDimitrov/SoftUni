
internal class SnakeMoves : IRun
{
    public void Run()
    {
        int[] rowsCols = Console.ReadLine()
                            .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];

        string[][] grid = new string[rows][];
        string snake = Console.ReadLine();
        List<string> snakeList = new List<string>();
        while (snakeList.Count < rows * cols)
        {
            foreach (var item in snake)
            {
                if (snakeList.Count >= rows * cols) break;
                snakeList.Add(item.ToString());
            }
        }

        for (int row = 0; row < rows; row++)
        {
            grid[row] = new string[cols];
            if (row % 2 == 0)
            {
                for (int col = 0; col < cols; col++)
                {
                    grid[row][col] = snakeList[0];
                    snakeList.RemoveAt(0);
                }
            }
            else
            {
                for (int col = cols - 1; col >= 0; col--)
                {
                    grid[row][col] = snakeList[0];
                    snakeList.RemoveAt(0);
                }
            }
        }
        foreach (var item in grid)
        {
            Console.WriteLine(string.Join("", item));
        }
    }
}
