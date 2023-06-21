using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorsAndComparators
{
    internal class CustomStackMain : IRun
    {
        public void Run()
        {
            CustomStack<string> customStack = new();
            string command = Console.ReadLine();
            while (!command.Equals("END"))
            {
                string[] param = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);

                switch (param[0])
                {
                    case "Push":
                        string[]? data = null;
                        if (param.Length > 1)
                        {
                            if (param[1].Length > 0)
                            {
                                data = param
                                        .Skip(1)
                                        .Select(s => s.Replace(",", ""))
                                        .ToArray();
                            }
                        }
                        customStack.Push(data);
                        break;
                    case "Pop":
                        customStack.Pop();
                        break;
                }
                command = Console.ReadLine();
            }
            customStack.Print();
            customStack.Print();
        }
    }
    internal class CustomStack<T>
    {
        private List<T> _list;

        public void Push(T[]? collection)
        {
            _list = new List<T>();
            if (collection != null)
            {
                if (collection.Length > 0)
                {
                    _list.AddRange(collection);
                }
            }
        }
        public void Pop()
        {
            if (_list.Count <= 0)
            {
                Console.WriteLine("No elements");
            }
            else _list.RemoveAt(_list.Count - 1);
        }
        public void Print()
        {
            for (int i = _list.Count - 1; i >= 0; i--)
            {
                Console.WriteLine(_list[i]);
            }
        }
    }
}
