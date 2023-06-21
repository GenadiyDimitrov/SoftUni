using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace DefiningClasses
{
    public class Person
    {
        public Person()
        {
        }
        public Person(int age)
        {
            Age = age;
        }
        public Person(string name)
        {
            Name = name;
        }
        public Person(string name, int age)
        {
            Name = name;
            Age = age;
        }
        private string _name = "No name";
        private int _age = 1;
        public string Name { get { return _name; } set { _name = value; } }
        public int Age { get { return _age; } set { _age = value; } }
    }
}
