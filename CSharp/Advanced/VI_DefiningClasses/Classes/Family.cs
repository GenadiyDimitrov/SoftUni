using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    public class Family
    {
        private List<Person> _people = new();

        public void AddMember(Person person)
        {
            _people.Add(person);
        }
        public Person GetOldestMember()
        {
            return _people.OrderByDescending(p => p.Age).First();
        }
        public List<Person> GetPeople() { return _people; }
    }
}
