using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IteratorsAndComparators
{
    internal class PersonMain : IRun
    {
        public void Run()
        {
            List<Person> persons = new();
            string command = Console.ReadLine();
            while (!command.Equals("END"))
            {
                persons.Add(new(command));
                command = Console.ReadLine();
            }
            int index = int.Parse(Console.ReadLine()) - 1;

            persons[index].ShowData(persons);
        }
    }
    internal class Person : IComparable
    {
        private string _name;
        private int _age;
        private string _town;
        public string GetName() { return _name; }
        public int GetAge() { return _age; }
        public string GetTown() { return _town; }
        public Person(string data)
        {
            string[] dataParam = data.Split(" ", StringSplitOptions.RemoveEmptyEntries)
                            .ToArray();
            _name = dataParam[0];
            _age = int.Parse(dataParam[1]);
            _town = dataParam[2];
        }

        public int CompareTo(object? obj)
        {
            if (obj is Person person)
            {
                if (person.GetName().Equals(_name))
                {
                    if (person.GetAge().Equals(_age))
                    {
                        if (person.GetTown().Equals(_town))
                        {
                            return 0;
                        }
                    }
                }
            }
            return -1;
        }

        public void ShowData(List<Person> list)
        {
            int matches = 0;
            int notEqual = 0;
            int total = list.Count;
            foreach (var person in list)
            {
                if (person.CompareTo(this) == 0)
                {
                    matches++;
                }
                else
                {
                    notEqual++;
                }
            }
            if (matches > 1)
            {
                Console.WriteLine($"{matches} {notEqual} {total}");
            }
            else
            {
                Console.WriteLine("No matches");
            }
        }
    }
}
