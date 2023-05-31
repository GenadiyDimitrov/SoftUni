namespace DefiningClasses
{
    internal interface IRun
    {
        void Run();
    }
    public class StartUp
    {
        private static IRun _run;
        //static void Main(string[] args)
        //{
        //    _run = new OpinionPoll();
        //    _run.Run();
        //}
    }
}