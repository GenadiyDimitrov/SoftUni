using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace PersonInfo
{
    public class Citizen : IPerson, IBirthable, IIdentifiable
    {
        public string Name { get; set; } = "";
        public int Age { get; set; } = 0;
        public string Id { get; set; } = "";
        public string Birthdate { get; set; } = "";

        public Citizen(string name, int age)
        {
            Age = age;
            Name = name;
        }

        public Citizen(string name, int age, string id, string birthdate) : this(name, age)
        {
            Birthdate = birthdate;
            Id = id;
        }
    }
}
