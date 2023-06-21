internal class PredicateParty : IRun
{
    static Func<string, string, string, bool> Check = (name, type, value) =>
    {
        switch (type)
        {
            case "StartsWith":
                if (name.StartsWith(value))
                {
                    return true;
                }
                return false;
            case "EndsWith":
                if (name.EndsWith(value))
                {
                    return true;
                }
                return false;
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
    static Func<IEnumerable<string>, string, string, string[]> Double = (arr, type, value) =>
    {
        List<string> list = arr.ToList();

        for (int i = 0; i < list.Count; i++)
        {
            if (Check(list[i], type, value))
            {
                list.Insert(i, list[i]);
                i++;
            }
        }
        return list.ToArray();
    };
    static Func<IEnumerable<string>, string, string, string, string[]> UpdateGuestsList = (arr, addRemove, type, value) =>
    {
        switch (addRemove)
        {
            case "Remove":
                return Remove(arr, type, value);
            case "Double":
                return Double(arr, type, value);
            default:
                return arr.ToArray();
        }
    };
    public void Run()
    {
        string[] arr = Console.ReadLine()
                                .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                                .ToArray();

        string command = Console.ReadLine();

        while (!command.Equals("Party!"))
        {
            string[] param = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);
            arr = UpdateGuestsList(arr, param[0], param[1], param[2]);

            command = Console.ReadLine();
        }

        if (arr.Length > 0)
        {
            Console.Write($"{string.Join(", ", arr)} are going to the party!");
        }
        else
        {
            Console.Write("Nobody is going to the party!");
        }
    }
}