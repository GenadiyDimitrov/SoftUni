
internal class Wardrobe : IRun
{
    public void Run()
    {
        int rows = int.Parse(Console.ReadLine());
        Dictionary<string, Dictionary<string, int>> wardrobe = new Dictionary<string, Dictionary<string, int>>();
        for (int i = 0; i < rows; i++)
        {
            string[] rowData = Console.ReadLine().Split(" -> ");
            string color = rowData[0];
            string[] types = rowData[1].Split(",");
            if (!wardrobe.ContainsKey(color))
            {
                wardrobe.Add(color, new Dictionary<string, int>());
            }
            foreach (var type in types)
            {
                if (!wardrobe[color].ContainsKey(type))
                {
                    wardrobe[color].Add(type, 0);
                }
                wardrobe[color][type]++;
            }
        }
        string[] lookingFor = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

        foreach (var color in wardrobe)
        {
            Console.WriteLine($"{color.Key} clothes:");
            foreach (var type in color.Value)
            {
                string found = "";
                if (lookingFor[0].Equals(color.Key) && lookingFor[1].Equals(type.Key))
                {
                    found = " (found!)";
                }
                Console.WriteLine($"* {type.Key} - {type.Value}{found}");
            }
        }
    }
}