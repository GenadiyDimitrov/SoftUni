
internal class CountSymbols : IRun
{
    public void Run()
    {
        string text = Console.ReadLine();
        SortedDictionary<char, int> symbols = new SortedDictionary<char, int>();
        foreach (char c in text)
        {
            if (!symbols.ContainsKey(c))
            {
                symbols[c] = 0;
            }
            symbols[c]++;
        }
        Console.WriteLine(
            string.Join(
                    Environment.NewLine,
                    symbols
                        .Select(x => $"{x.Key}: {x.Value} time/s")
                       )
            );
    }
}