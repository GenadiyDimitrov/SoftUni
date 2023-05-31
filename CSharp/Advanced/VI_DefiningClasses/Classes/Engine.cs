using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DefiningClasses
{
    public class Engine
    {
        string _model = "";
        string _efficiency = "";
        int? _displacement = null;
        int _speed = 0;
        int _power = 0;
        public Engine() { }
        public Engine(int speed, int power)
        {
            Speed = speed;
            Power = power;
        }
        public Engine(string model, int power)
        {
            Model = model;
            Power = power;
        }

        public string Efficiency
        {
            get
            {
                return _efficiency;
            }
            set
            {
                _efficiency = value;
            }
        }
        public string Model
        {
            get
            {
                return _model;
            }
            set
            {
                _model = value;
            }
        }
        public int Speed
        {
            get
            {
                return _speed;
            }
            set
            {
                _speed = value;
            }
        }
        public int Power
        {
            get { return _power; }
            set
            {
                _power = value;
            }
        }
        public int? Displacement
        {
            get { return _displacement; }
            set
            {
                _displacement = value;
            }
        }
    }
}
