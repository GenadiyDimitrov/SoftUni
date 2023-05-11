internal class ReverseAString : IRun
{
    private Stack<char> chars;
    public void Run()
    {
        chars = new Stack<char>(Console.ReadLine());
        foreach (var c in chars)
        {
            Console.Write(c);
        }
    }
}