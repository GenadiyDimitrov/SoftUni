
internal class MatrixShuffling : IRun
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

        string command = Console.ReadLine()
                            .ToLower();
        while (!command.Equals("end"))
        {
            string[] commandParam = command
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                    .ToArray();
            bool valid = false;
            if (commandParam.Length == 5)
            {
                if (commandParam[0].Equals("swap"))
                {
                    int firstRow = int.TryParse(commandParam[1], out int fr) ? fr : -1;
                    int firstCol = int.TryParse(commandParam[2], out int fc) ? fc : -1;
                    int secondRow = int.TryParse(commandParam[3], out int sr) ? sr : -1;
                    int secondCol = int.TryParse(commandParam[4], out int sc) ? sc : -1;

                    if (firstRow >= -1 && firstCol > -1 && secondRow > -1 && secondCol > -1)
                    {
                        if (firstRow < rows && secondRow < rows)
                        {
                            if (firstCol < matrix[firstRow].Length && secondCol < matrix[secondRow].Length)
                            {
                                valid = true;

                                string firstItem = matrix[firstRow][firstCol];
                                string secondItem = matrix[secondRow][secondCol];
                                matrix[firstRow][firstCol] = secondItem;
                                matrix[secondRow][secondCol] = firstItem;

                                foreach (var printRow in matrix)
                                {
                                    Console.WriteLine(string.Join(" ", printRow));
                                }
                            }
                        }
                    }
                }
            }
            if (!valid)
            {
                Console.WriteLine("Invalid input!");
            }

            command = Console.ReadLine()
                        .ToLower();
        }
    }
}