﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Restaurant
{
    public class Coffee : HotBeverage
    {
        public double Caffeine { get; set; }
        public Coffee(string name, double coffeine) : base(name, 3.50M, 50)
        {
            //Coffeine ..... RLY!!! Typo
            Caffeine = coffeine;
        }
    }
}
