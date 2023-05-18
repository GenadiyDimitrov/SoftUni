
internal class UniqueUsernames : IRun
{
    public void Run()
    {
        int rows = int.Parse(Console.ReadLine());
        HashSet<string> names = new HashSet<string>();
        for (int row = 0; row < rows; row++)
        {
            string name = Console.ReadLine();
            names.Add(name);
        }
        foreach (var name in names)
        {
            Console.WriteLine(name);
        }
    }
}