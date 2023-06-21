
internal class KnightGame : IRun
{
    public void Run()
    {
        int rows = int.Parse(Console.ReadLine());
        //Create the board
        char[][] board = new char[rows][];
        //Fill the board
        for (int row = 0; row < rows; row++)
        {
            board[row] = Console.ReadLine()
                            .ToLower()
                            .ToCharArray();

        }
        int removed = 0;
        while (true)
        {
            //create hitBoard to count each knight hits
            int[,] hitBoard = new int[rows, rows];
            for (int row = 0; row < rows; row++)
            {
                for (int col = 0; col < rows; col++)
                {
                    char currentPiece = board[row][col];
                    if (currentPiece == 'k')
                    {
                        //Check each side of the current knight
                        //and increase the number of hits it does
                        #region vv> vv< DOWN Check 2 down one left/right
                        int rowPlus = row + 2;
                        int columnPlus = col + 1;
                        int columnMinus = col - 1;

                        if (rowPlus >= 0 && rowPlus < rows)
                        {
                            if (columnPlus >= 0 && columnPlus < rows)
                            {
                                if (board[rowPlus][columnPlus] == currentPiece)
                                {
                                    hitBoard[rowPlus, columnPlus]++;
                                }
                            }
                            if (columnMinus >= 0 && columnMinus < rows)
                            {
                                if (board[rowPlus][columnMinus] == currentPiece)
                                {
                                    hitBoard[rowPlus, columnMinus]++;
                                }
                            }
                        }
                        #endregion
                        #region >>^ >>v RIGHT Check 2 right one up/down
                        columnPlus = col + 2;
                        rowPlus = row + 1;
                        int rowMinus = row - 1;

                        if (columnPlus >= 0 && columnPlus < rows)
                        {
                            if (rowPlus >= 0 && rowPlus < rows)
                            {
                                if (board[rowPlus][columnPlus] == currentPiece)
                                {
                                    hitBoard[rowPlus, columnPlus]++;
                                }
                            }
                            if (rowMinus >= 0 && rowMinus < rows)
                            {
                                if (board[rowMinus][columnPlus] == currentPiece)
                                {
                                    hitBoard[rowMinus, columnPlus]++;
                                }
                            }
                        }
                        #endregion
                        #region <<^ <<v LEFT Check 2 left one up/down
                        columnMinus = col - 2;
                        rowMinus = row - 1;
                        rowPlus = row + 1;

                        if (columnMinus >= 0 && columnMinus < rows)
                        {
                            if (rowMinus >= 0 && rowMinus < rows)
                            {
                                if (board[rowMinus][columnMinus] == currentPiece)
                                {
                                    hitBoard[rowMinus, columnMinus]++;
                                }
                            }
                            if (rowPlus >= 0 && rowPlus < rows)
                            {
                                if (board[rowPlus][columnMinus] == currentPiece)
                                {
                                    hitBoard[rowPlus, columnMinus]++;
                                }
                            }
                        }
                        #endregion
                        #region ^^< ^^> UP Check 2 up one left/right
                        rowMinus = row - 2;
                        columnPlus = col + 1;
                        columnMinus = col - 1;

                        if (rowMinus >= 0 && rowMinus < rows)
                        {
                            if (columnPlus >= 0 && columnPlus < rows)
                            {
                                if (board[rowMinus][columnPlus] == currentPiece)
                                {
                                    hitBoard[rowMinus, columnPlus]++;
                                }
                            }
                            if (columnMinus >= 0 && columnMinus < rows)
                            {
                                if (board[rowMinus][columnMinus] == currentPiece)
                                {
                                    hitBoard[rowMinus, columnMinus]++;
                                }
                            }
                        }
                        #endregion
                    }
                }
            }


            int maxHits = 0;
            int maxHitColumn = -1;
            int maxHitRow = -1;

            //find the knight that got hit most
            for (int row = 0; row < hitBoard.GetLength(0); row++)
            {
                for (int col = 0; col < hitBoard.GetLength(1); col++)
                {
                    int currentPiece = hitBoard[row, col];
                    if (maxHits < currentPiece)
                    {
                        maxHits = currentPiece;
                        maxHitColumn = col;
                        maxHitRow = row;
                    }
                }
            }

            //if there is a knight to remove -> remove
            //else break the cycle and print result
            if (maxHits > 0)
            {
                board[maxHitRow][maxHitColumn] = '0';
                removed++;
            }
            else
            {
                break;
            }
        }

        Console.WriteLine(removed);
    }
}