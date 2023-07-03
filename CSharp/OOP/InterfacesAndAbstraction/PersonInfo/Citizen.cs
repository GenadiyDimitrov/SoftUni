using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace PersonInfo
{
    public class Citizen : IPerson
    {
        public string Name { get; set; } = "";
        public int Age { get; set; } = 0;
        public Citizen(string name, int age)
        {
            Age = age;
            Name = name;
        }

    }
}
