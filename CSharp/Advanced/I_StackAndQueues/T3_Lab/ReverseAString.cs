internal class ReverseAString : IRun
{
    public void Run()
    {
        Stack<char> chars = new Stack<char>(Console.ReadLine());
        foreach (var c in chars)
        {
            Console.Write(c);
        }
    }
}