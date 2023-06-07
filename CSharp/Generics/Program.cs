using System;
using System.Linq;

namespace Generics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            RandomTupleActions();
        }

        public static void RandomTupleActions()
        {
            IEnumerable<string> data = Console.ReadLine()
                                              .Split(" ", StringSplitOptions.RemoveEmptyEntries);
            var personsData = new NewTuple<string, string, string>(data.ElementAt(0) + " " + data.ElementAt(1), data.ElementAt(2), string.Join(" ", data.Skip(3)));
            data = Console.ReadLine()
                          .Split(" ", StringSplitOptions.RemoveEmptyEntries);
            var drinkData = new NewTuple<string, int, bool>(data.ElementAt(0), int.Parse(data.ElementAt(1)), data.ElementAt(2).Equals("drunk"));
            data = Console.ReadLine()
                          .Split(" ", StringSplitOptions.RemoveEmptyEntries);
            var randomData = new NewTuple<string, double, string>(data.ElementAt(0), double.Parse(data.ElementAt(1)), data.ElementAt(2));

            Console.WriteLine($"{personsData.Item1} -> {personsData.Item2} -> {personsData.Item3}");
            Console.WriteLine($"{drinkData.Item1} -> {drinkData.Item2} -> {drinkData.Item3}");
            Console.WriteLine($"{randomData.Item1} -> {randomData.Item2} -> {randomData.Item3}");
        }

    }
}