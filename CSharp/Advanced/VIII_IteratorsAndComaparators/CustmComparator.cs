using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorsAndComparators
{
    internal class CustmComparator : IRun
    {
        public void Run()
        {
            int[] ints = Console.ReadLine()
                                .Split(" ", StringSplitOptions.RemoveEmptyEntries).Select(int.Parse)
                                .ToArray();
            CustomList list = new(ints);
            list.Sort();
            list.Print();
        }
    }
    public class CustomList
    {
        List<int> odd = new();
        List<int> even = new();
        public CustomList(int[] values)
        {
            foreach (int item in values)
            {
                if (item % 2 == 0)
                {
                    even.Add(item);
                }
                else
                {
                    odd.Add(item);
                }
            }
        }

        public void Sort()
        {
            even.Sort();
            odd.Sort();
        }
        public void Print()
        {
            Console.WriteLine($"{string.Join(" ", even)}{(odd.Count > 0 ? $" {string.Join(" ", odd)}" : "")}");
        }
    }

}
