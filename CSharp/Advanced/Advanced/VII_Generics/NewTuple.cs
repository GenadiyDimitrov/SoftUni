using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Generics
{
    internal class NewTuple<T1, T2, T3>
    {
        public T1 Item1;
        public T2 Item2;
        public T3 Item3;

        public NewTuple(T1 t1)
        {
            Item1 = t1;
        }
        public NewTuple(T1 t1, T2 t2)
        {
            Item1 = t1;
            Item2 = t2;
        }
        public NewTuple(T1 t1, T2 t2, T3 t3)
        {
            Item1 = t1;
            Item2 = t2;
            Item3 = t3;
        }
    }
}
