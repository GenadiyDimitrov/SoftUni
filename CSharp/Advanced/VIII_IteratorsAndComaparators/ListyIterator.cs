using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorsAndComparators
{
    internal class ListyIteratorMain : IRun
    {
        public void Run()
        {
            ListyIterator<string> listyIterator = new();
            string command = Console.ReadLine();
            while (!command.Equals("END"))
            {
                string[] param = command.Split(" ", StringSplitOptions.RemoveEmptyEntries);

                switch (param[0])
                {
                    case "Create":
                        string[]? data = null;
                        if (param.Length > 1)
                        {
                            if (param[1].Length > 0)
                            {
                                data = param.Skip(1).ToArray();
                            }
                        }
                        listyIterator.Create(data);
                        break;
                    case "Move":
                        Console.WriteLine(listyIterator.Move());
                        break;
                    case "HasNext":
                        Console.WriteLine(listyIterator.HasNext);
                        break;
                    case "Print":
                        listyIterator.Print();
                        break;
                    case "PrintAll":
                        listyIterator.PrintAll();
                        break;
                }
                command = Console.ReadLine();
            }
        }
    }
    internal class ListyIterator<T> : IEnumerable<T>
    {
        private int _index = 0;
        private List<T> _list;

        public void Create(T[]? collection)
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
        public bool Move()
        {
            if (_index + 1 < _list.Count)
            {
                _index++;
                return true;
            }
            return false;
        }
        public void Print()
        {
            if (_index < _list.Count)
            {
                Console.WriteLine(_list[_index]);
            }
            else
            {
                Console.WriteLine("Invalid Operation!");
            }
        }
        public void PrintAll()
        {
            if (_list.Count > 0)
            {
                Console.WriteLine(string.Join(" ", _list));
            }
            else
            {
                Console.WriteLine("Invalid Operation!");
            }
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return this.GetEnumerator();
        }

        public IEnumerator<T> GetEnumerator()
        {
            for (int i = 0; i < _list.Count; i++)
                yield return _list[i];
        }

        public bool HasNext { get { return _index + 1 < _list.Count; } }
    }
}
