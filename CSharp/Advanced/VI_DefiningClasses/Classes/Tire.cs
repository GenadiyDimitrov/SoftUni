using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    public class Tire
    {

        int _age = 0;
        double _pressure = 0;
        public Tire() { }
        public Tire(double pressure, int age)
        {
            Age = age;
            Pressure = pressure;
        }
        public int Age
        {
            get
            {
                return _age;
            }
            set
            {
                _age = value;
            }
        }
        public double Pressure
        {
            get { return _pressure; }
            set
            {
                _pressure = value;
            }
        }
    }
}
