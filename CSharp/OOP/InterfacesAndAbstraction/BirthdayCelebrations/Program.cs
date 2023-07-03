namespace BirthdayCelebrations
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> birthdates = new();
            string command = Console.ReadLine();
            while (!command.Equals("End"))
            {
                string date = command.Split(" ", StringSplitOptions.RemoveEmptyEntries).Last();
                if (date.Contains("/")) birthdates.Add(date);
                command = Console.ReadLine();
            }

            string year = Console.ReadLine();

            foreach (var birthdate in birthdates)
            {
                if (birthdate.EndsWith(year))
                {
                    Console.WriteLine(birthdate);
                }
            }
        }
    }
}