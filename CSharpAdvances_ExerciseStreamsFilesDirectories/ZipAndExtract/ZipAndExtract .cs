namespace ZipAndExtract
{
    using System;
    using System.IO;
    using System.IO.Compression;

    public class ZipAndExtract
    {
        static string newDirPath = "";
        static string fileName = "";
        static void Main()
        {
            string inputFile = @"..\..\..\copyMe.png";
            string zipArchiveFile = @"..\..\..\archive.zip";
            string extractedFile = @"..\..\..\extracted.png";

            newDirPath = Path.GetDirectoryName(inputFile) + "\\newDir";

            Directory.CreateDirectory(newDirPath);


            fileName = Path.GetFileName(inputFile);
            ZipFileToArchive(inputFile, zipArchiveFile);

            ExtractFileFromArchive(zipArchiveFile, fileName, extractedFile);


            Directory.Delete(newDirPath, true);
        }

        public static void ZipFileToArchive(string inputFilePath, string zipArchiveFilePath)
        {
            string fullPath = Path.Combine(newDirPath, fileName);
            File.Copy(inputFilePath, fullPath);

            ZipFile.CreateFromDirectory(newDirPath, zipArchiveFilePath);

            File.Delete(fullPath);
        }

        public static void ExtractFileFromArchive(string zipArchiveFilePath, string fileName, string outputFilePath)
        {
            ZipFile.ExtractToDirectory(zipArchiveFilePath, newDirPath);
            File.Move(Path.Combine(newDirPath, fileName), outputFilePath);
        }
    }
}
