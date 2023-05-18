internal interface IRun
{
    void Run();
}
internal class Program
{
    private static IRun _run;
    static void Main(string[] args)
    {
        //Change Class for Exersice
        _run = new Wardrobe();
        _run.Run();
    }
}

//PASTE RUN CLASS HERE FOR JUDGE VVVVV

//^^^^^^^

