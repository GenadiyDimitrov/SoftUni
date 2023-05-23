namespace CopyDirectory
{
    using System;
    using System.IO;

    public class CopyDirectory
    {
        //static void Main()
        //{
        //    string inputPath = @$"{Console.ReadLine()}";
        //    string outputPath = @$"{Console.ReadLine()}";

        //    CopyAllFiles(inputPath, outputPath);
        //}

        public static void CopyAllFiles(string inputPath, string outputPath)
        {
            if (Directory.Exists(outputPath))
            {
                Directory.Delete(outputPath, true);
            }

            Directory.CreateDirectory(outputPath);
            DirectoryInfo dirInfo = new DirectoryInfo(inputPath);
            foreach (var file in dirInfo.GetFiles("*", SearchOption.TopDirectoryOnly))
            {
                using (FileStream readStream = new FileStream(file.FullName, FileMode.Open))
                {
                    using (FileStream writeStream = new FileStream(outputPath + @$"\{file.Name}", FileMode.OpenOrCreate))
                    {
                        readStream.CopyTo(writeStream);
                    }
                }
            }
        }
    }
}
