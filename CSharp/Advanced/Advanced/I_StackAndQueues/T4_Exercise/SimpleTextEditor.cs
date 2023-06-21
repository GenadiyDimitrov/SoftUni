internal class SimpleTextEditor : IRun
{
    public void Run()
    {
        string text = "";
        int commandsCount = int.Parse(Console.ReadLine());
        Stack<string> undos = new();
        for (int i = 0; i < commandsCount; i++)
        {
            string[] cmdPrm = Console.ReadLine()
                                .Split(" ", StringSplitOptions.RemoveEmptyEntries);
            int cmd = int.Parse(cmdPrm[0]);
            switch (cmd)
            {
                case 1:
                    undos.Push(text);
                    text += cmdPrm[1];
                    break;
                case 2:
                    undos.Push(text);
                    int count = int.Parse(cmdPrm[1]);
                    text = text.Substring(0, text.Length - count);
                    break;
                case 3:
                    int index = int.Parse(cmdPrm[1]) - 1;
                    Console.WriteLine(text[index]);
                    break;
                case 4:
                    text = undos.Pop();
                    break;
            }
        }
    }
}