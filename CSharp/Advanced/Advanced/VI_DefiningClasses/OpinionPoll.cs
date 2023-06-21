using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    internal class OpinionPoll : IRun
    {
        public void Run()
        {
            int count = int.Parse(Console.ReadLine());
            Family family = new Family();
            for (int i = 0; i < count; i++)
            {
                string[] param = Console.ReadLine()
                                    .Split(" ", StringSplitOptions.RemoveEmptyEntries);
                family.AddMember(new Person(param[0], int.Parse(param[1])));
            }
            var ordered = family.GetPeople()
                                    .Where(p => p.Age > 30)
                                    .OrderBy(p => p.Name)
                                    .Select(p=> $"{p.Name} - {p.Age}");
            Console.WriteLine(string.Join("\n", ordered));
        }
    }
}
