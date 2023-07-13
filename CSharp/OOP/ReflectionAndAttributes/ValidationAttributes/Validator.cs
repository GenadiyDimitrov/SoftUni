using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace ValidationAttributes
{
    public static class Validator
    {
        public static bool IsValid(object obj)
        {
            Type type = obj.GetType();

            PropertyInfo[] propertyInfos = type
            .GetProperties()
            .Where(p => p.CustomAttributes
            .Any(ca => typeof(MyValidationAttribute)
            .IsAssignableFrom(ca.AttributeType)))
            .ToArray();
            foreach (PropertyInfo pI in propertyInfos)
            {
                IEnumerable<MyValidationAttribute> attriCollection = pI.GetCustomAttributes(true)
                                                                        .Where(ca => typeof(MyValidationAttribute)
                                                                        .IsAssignableFrom(ca.GetType()))
                                                                        .Cast<MyValidationAttribute>();
                foreach (var attrInfo in attriCollection)
                {
                    if (!attrInfo.IsValid(pI.GetValue(obj)))
                    {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
