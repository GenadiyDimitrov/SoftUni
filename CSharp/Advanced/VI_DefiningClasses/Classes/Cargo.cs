using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    public class Cargo
    {

        string _type = "";
        int _weight = 0;
        public Cargo() { }
        public Cargo(int weight, string type)
        {
            Type = type;
            Weight = weight;
        }
        public string Type
        {
            get
            {
                return _type;
            }
            set
            {
                _type = value;
            }
        }
        public int Weight
        {
            get { return _weight; }
            set
            {
                _weight = value;
            }
        }
    }
}
