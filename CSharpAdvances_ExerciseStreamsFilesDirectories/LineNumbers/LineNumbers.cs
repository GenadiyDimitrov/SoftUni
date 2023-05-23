namespace LineNumbers
{
    using System.IO;
    using System.Linq;

    public class LineNumbers
    {
        static void Main()
        {
            string inputFilePath = @"..\..\..\text.txt";
            string outputFilePath = @"..\..\..\output.txt";

            ProcessLines(inputFilePath, outputFilePath);
        }

        public static void ProcessLines(string inputFilePath, string outputFilePath)
        {
            string[] lines = File.ReadLines(inputFilePath).ToArray();
            for (int i = 0; i < lines.Length; i++)
            {
                string line = lines[i];
                int lettersCount = line.ToCharArray().Where(c => char.IsLetter(c)).Count();
                int specialCount = line.ToCharArray().Where(c => char.IsPunctuation(c)).Count();
                lines[i] = $"Line {i + 1}: {line} ({lettersCount})({specialCount})";
            }
            File.WriteAllLines(outputFilePath, lines);
        }
    }
}
