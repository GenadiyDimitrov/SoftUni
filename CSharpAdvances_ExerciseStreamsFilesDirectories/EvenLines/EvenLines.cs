namespace EvenLines
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;

    public class EvenLines
    {
        static void Main()
        {
            string inputFilePath = @"..\..\..\text.txt";

            Console.WriteLine(ProcessLines(inputFilePath));
        }

        public static string ProcessLines(string inputFilePath)
        {
            List<string> lines = new();
            using (StreamReader reader = new StreamReader(inputFilePath))
            {
                bool isEven = true;
                while (!reader.EndOfStream)
                {
                    string line = reader.ReadLine();
                    if (isEven)
                    {
                        isEven = false;
                        lines.Add(string.Join(" ", line
                                                    .Split(" ")
                                                    .Reverse()
                                             )
                                            .Replace("-", "@")
                                            .Replace(",", "@")
                                            .Replace("!", "@")
                                            .Replace("?", "@")
                                            .Replace(".", "@")
                                );
                    }
                    else isEven = true;
                }
            }
            return string.Join("\n", lines.ToArray());
        }
    }
}
