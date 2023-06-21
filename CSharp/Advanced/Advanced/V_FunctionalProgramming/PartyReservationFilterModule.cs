
internal class PartyReservationFilterModule : IRun
{
    static Func<string, string, string, bool> Check = (name, type, value) =>
    {
        switch (type)
        {
            case "Starts with":
                return name.StartsWith(value);
            case "Ends with":
                return name.EndsWith(value);
            case "Contains":
                return name.Contains(value);
            case "Length":
                if (int.TryParse(value, out var length))
                {
                    if (name.Length.Equals(length))
                    {
                        return true;
                    }
                }
                return false;
            default:
                return false;
        }
    };
    static Func<IEnumerable<string>, string, string, string[]> Remove = (arr, type, value) =>
    {
        List<string> list = arr.ToList();

        for (int i = 0; i < list.Count; i++)
        {
            if (Check(list[i], type, value))
            {
                list.RemoveAt(i);
                i--;
            }
        }
        return list.ToArray();
    };
    public void Run()
    {

        string[] arr = Console.ReadLine()
                                .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                .ToArray();

        string command = Console.ReadLine();
        List<string> filters = new List<string>();
        while (!command.Equals("Print"))
        {
            string[] param = command.Split(";", StringSplitOptions.RemoveEmptyEntries);
            string filter = $"{param[1]};{param[2]}";
            if (param[0].Equals("Add filter") && !filters.Contains(filter))
            {
                filters.Add(filter);
            }
            else if (param[0].Equals("Remove filter"))
            {
                filters.Remove(filter);
            }

            command = Console.ReadLine();
        }
        foreach (var filter in filters)
        {
            string[] param = filter.Split(";", StringSplitOptions.RemoveEmptyEntries);
            arr = Remove(arr, param[0], param[1]);
        }
        if (arr.Length > 0)
        {
            Console.Write(string.Join(" ", arr));
        }
    }
}