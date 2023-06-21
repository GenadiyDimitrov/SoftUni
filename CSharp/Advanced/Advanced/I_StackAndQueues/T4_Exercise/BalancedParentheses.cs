
internal class BalancedParentheses : IRun
{
    Stack<char> stack = new();
    private bool CheckForNO(char check)
    {
        if (stack.Any())
        {
            if (stack.Peek() == check)
            {
                stack.Pop();
                return false;
            }
        }
        Console.WriteLine("NO");
        return true;
    }
    public void Run()
    {
        string input = Console.ReadLine();
        foreach (char c in input)
        {
            switch (c)
            {
                case '{':
                case '[':
                case '(':
                    stack.Push(c);
                    break;
                case ']':
                    if (CheckForNO('[')) return;
                    break;
                case ')':
                    if (CheckForNO('(')) return;
                    break;
                case '}':
                    if (CheckForNO('{')) return;
                    break;
            }
        }
        if (stack.Any())
        {
            Console.WriteLine("NO");
        }
        else
        {
            Console.WriteLine("YES");
        }
    }
}
