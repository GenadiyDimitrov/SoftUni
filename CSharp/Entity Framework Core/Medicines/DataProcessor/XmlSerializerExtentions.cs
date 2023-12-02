using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Medicines.DataProcessor
{

    public static class XmlSerializerExtentions
    {
        public static T DeserializeFromXml<T>(this string inputXml, string rootTag)
        {
            XmlRootAttribute root = new(rootTag);
            XmlSerializer serializer = new(typeof(T), root);

            using MemoryStream memoryStream = new(Encoding.UTF8.GetBytes(inputXml));

            return (T)serializer.Deserialize(memoryStream);
        }
        public static string SerializeToXml<T>(this T dto, string xmlRootAttribute)
        {
            XmlSerializer xmlSerializer = new(typeof(T), new XmlRootAttribute(xmlRootAttribute));

            XmlSerializerNamespaces xmlSerializerNamespaces = new();
            xmlSerializerNamespaces.Add(string.Empty, string.Empty);

            using MemoryStream memoryStream = new();
            xmlSerializer.Serialize(memoryStream, dto, xmlSerializerNamespaces);

            return Encoding.UTF8.GetString(memoryStream.ToArray());
        }
    }
}
