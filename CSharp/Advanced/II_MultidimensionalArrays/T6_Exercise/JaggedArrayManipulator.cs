
internal class JaggedArrayManipulator : IRun
{
    public void Run()
    {
        int rows = int.Parse(Console.ReadLine());
        int[][] jaggedArray = new int[rows][];
        for (int row = 0; row < rows; row++)
        {
            jaggedArray[row] = Console.ReadLine()
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                    .Select(int.Parse)
                                    .ToArray();

        }
        for (int row = 0; row < rows - 1; row++)
        {
            if (jaggedArray[row].Length == jaggedArray[row + 1].Length)
            {
                for (int i = 0; i < jaggedArray[row].Length; i++)
                {
                    jaggedArray[row][i] *= 2;
                    jaggedArray[row + 1][i] *= 2;
                }
            }
            else
            {
                for (int i = 0; i < jaggedArray[row].Length; i++)
                {
                    jaggedArray[row][i] /= 2;
                }
                for (int i = 0; i < jaggedArray[row + 1].Length; i++)
                {
                    jaggedArray[row + 1][i] /= 2;
                }
            }
        }

        string command = Console.ReadLine()
                            .ToLower();
        while (!command.Equals("end"))
        {
            string[] commandParam = command
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                    .ToArray();

            int selectedRow = int.TryParse(commandParam[1], out var sR) ? sR : -1;
            int selectedColumn = int.TryParse(commandParam[2], out var sC) ? sC : -1;
            int value = int.TryParse(commandParam[3], out var val) ? val : -1;
            if (selectedRow > -1 && selectedRow < jaggedArray.Length)
            {
                if (selectedColumn > -1 && selectedColumn < jaggedArray[selectedRow].Length)
                {
                    if (commandParam[0].Equals("add"))
                    {
                        jaggedArray[selectedRow][selectedColumn] += value;
                    }
                    else if (commandParam[0].Equals("subtract"))
                    {
                        jaggedArray[selectedRow][selectedColumn] -= value;
                    }
                }
            }
            command = Console.ReadLine()
                            .ToLower();
        }
        foreach (var row in jaggedArray)
        {
            Console.WriteLine(string.Join(" ", row));
        }
    }
}