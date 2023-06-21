namespace DirectoryTraversal
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;

    public class DirectoryTraversal
    {
        //static void Main()
        //{
        //    string path = Console.ReadLine();
        //    string reportFileName = @"\report.txt";

        //    string reportContent = TraverseDirectory(path);
        //    Console.WriteLine(reportContent);

        //    WriteReportToDesktop(reportContent, reportFileName);
        //}

        public static string TraverseDirectory(string inputFolderPath)
        {
            Dictionary<string, Dictionary<string, double>> files = new();
            DirectoryInfo dirInfo = new DirectoryInfo(inputFolderPath);
            foreach (var file in dirInfo.GetFiles("*", SearchOption.TopDirectoryOnly))
            {

                double size = file.Length / 1024.000;
                string filename = file.Name;
                string fileExtention = file.Extension;

                if (files.TryGetValue(fileExtention, out var list))
                {
                    list.Add(filename, size);
                }
                else
                {
                    files[fileExtention] = new() { { filename, size } };
                }
            }

            var ordered = files.OrderByDescending(f => f.Value.Count).ThenBy(f => f.Key);
            List<string> reportLines = new();
            foreach (var data in ordered)
            {
                reportLines.Add(data.Key);
                var orderedData = data.Value.OrderByDescending(f => f.Value);
                foreach (var file in orderedData)
                {
                    reportLines.Add($"--{file.Key} - {file.Value:0.###}kb");
                }
            }
            return string.Join("\n", reportLines);
        }

        public static void WriteReportToDesktop(string textContent, string reportFileName)
        {
            string desktopPath = @$"C:\Users\{Environment.UserName}\Desktop{reportFileName}";
            File.WriteAllText(desktopPath, textContent);
        }
    }
}
