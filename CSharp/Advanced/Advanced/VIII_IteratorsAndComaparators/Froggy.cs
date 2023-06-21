using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorsAndComparators
{
    internal class FroggyMain : IRun
    {
        public void Run()
        {
            Froggy frog = new(Console.ReadLine());
            frog.Print();
        }
    }
    internal class Froggy
    {
        List<int> upper = new();
        List<int> lower = new();


        public Froggy(string data)
        {
            int[] ints = data.Split(", ", StringSplitOptions.RemoveEmptyEntries)
                            .Select(int.Parse)
                            .ToArray();

            bool flag = true;
            foreach (int i in ints)
            {
                if (flag)
                {
                    upper.Add(i);
                }
                else
                {
                    lower.Add(i);
                }
                flag = !flag;
            }
            lower.Reverse();
        }
        public void Print()
        {
            Console.WriteLine($"{string.Join(", ", upper)}{(lower.Count > 0 ? $", {string.Join(", ", lower)}" : "")}");
        }
    }
}
