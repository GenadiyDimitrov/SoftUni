using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    internal class OldestFamilyMember : IRun
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
            Person oldest = family.GetOldestMember();
            Console.WriteLine($"{oldest.Name} {oldest.Age}");
        }
    }
}
