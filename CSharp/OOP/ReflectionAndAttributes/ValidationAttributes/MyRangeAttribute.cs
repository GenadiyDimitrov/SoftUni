using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ValidationAttributes
{
    internal class MyRangeAttribute : MyValidationAttribute
    {
        private int minValue;
        private int maxValue;
        public MyRangeAttribute(int min, int max)
        {
            minValue = min;
            maxValue = max;
        }
        public override bool IsValid(object obj)
            => (int)obj > minValue && (int)obj < maxValue;
    }
}
