using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MouseInTheKitchen
{
    internal class MouseInTheKitchen : IRun
    {
        int[] _mousePosition;
        string[][] _board;
        int _cheeseCount;
        bool _mouseTrapped;
        bool _mouseLeft;
        public void Run()
        {
            int[] dimetions = Console.ReadLine()
                                        .Split(",", StringSplitOptions.RemoveEmptyEntries)
                                        .Select(int.Parse)
                                        .ToArray();

            int rows = dimetions[0];
            int columns = dimetions[1];
            _mousePosition = new int[] { -1, -1 };
            _board = new string[rows][];
            _cheeseCount = 0;
            _mouseTrapped = false;
            _mouseLeft = false;
            for (int row = 0; row < rows; row++)
            {
                string rowData = Console.ReadLine();
                _board[row] = rowData.ToCharArray()
                                    .Select(ch => ch.ToString())
                                    .ToArray();

                if (rowData.Contains("M"))
                {
                    _mousePosition[0] = row;
                    _mousePosition[1] = rowData.IndexOf("M");
                }
                _cheeseCount += rowData.Count(c => c.Equals('C'));
            }

            string command = Console.ReadLine();
            while (!command.Equals("danger"))
            {
                switch (command)
                {
                    case "left":
                        LeftRight(-1);
                        break;
                    case "right":
                        LeftRight(+1);
                        break;
                    case "up":
                        UpDown(-1);
                        break;
                    case "down":
                        UpDown(+1);
                        break;
                }

                if (CheckAndPrint())
                {
                    break;
                }
                command = Console.ReadLine();
            }
            if (command.Equals("danger"))
            {
                Console.WriteLine("Mouse will come back later!");
            }
            foreach (var row in _board)
            {
                Console.WriteLine(string.Join("", row));
            }
        }
        private bool CheckAndPrint()
        {
            if (_mouseTrapped)
            {
                Console.WriteLine("Mouse is trapped!");
                return true;
            }
            else if (_mouseLeft)
            {
                Console.WriteLine("No more cheese for tonight!");
                return true;
            }
            else if (_cheeseCount <= 0)
            {
                Console.WriteLine("Happy mouse! All the cheese is eaten, good night!");
                return true;
            }
            return false;
        }
        private void Move(int newRow, int newColumn)
        {
            int oldRow = _mousePosition[0];
            int oldColumn = _mousePosition[1];

            _board[oldRow][oldColumn] = "*";
            _board[newRow][newColumn] = "M";

            _mousePosition[0] = newRow;
            _mousePosition[1] = newColumn;
        }
        private void UpDown(int direction)
        {
            int newRow = _mousePosition[0] + direction;
            int currentColumn = _mousePosition[1];

            if (newRow < 0 || newRow >= _board.Length)
            {
                _mouseLeft = true;
            }
            else
            {
                switch (_board[newRow][currentColumn])
                {
                    case "*":
                        Move(newRow, currentColumn);
                        break;
                    case "C":
                        Move(newRow, currentColumn);
                        _cheeseCount--;
                        break;
                    case "T":
                        Move(newRow, currentColumn);
                        _mouseTrapped = true;
                        break;
                    case "@":
                        break;
                }
            }
        }
        private void LeftRight(int direction)
        {
            int currentRow = _mousePosition[0];
            int newColumn = _mousePosition[1] + direction;

            if (newColumn < 0 || newColumn >= _board[currentRow].Length)
            {
                _mouseLeft = true;
            }
            else
            {
                switch (_board[currentRow][newColumn])
                {
                    case "*":
                        Move(currentRow, newColumn);
                        break;
                    case "C":
                        Move(currentRow, newColumn);
                        _cheeseCount--;
                        break;
                    case "T":
                        Move(currentRow, newColumn);
                        _mouseTrapped = true;
                        break;
                    case "@":
                        break;
                }
            }
        }
    }
}
