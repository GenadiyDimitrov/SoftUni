using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Generics
{
    public static class GenericMethods
    {
        public static void SwapAndPrint<T>(List<T> list, int a, int b)
        {
            T tmp = list[a];
            list[a] = list[b];
            list[b] = tmp;

            foreach (T item in list)
            {
                Console.WriteLine($"{item.GetType().FullName}: {item}");
            }
        }

        public static void CountLarger<T>(List<T> list, T compare)
            where T : IComparable<T>
        {
            int count = 0;
            foreach (T item in list)
            {
                if (item.CompareTo(compare) > 0)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }
    }
}
