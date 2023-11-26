using System.Xml.Serialization;

namespace CarDealer.Dtos.Export
{
    [XmlType(Constants.CarLowerCase)]
    public class ExportCarFromMakeBmwDto
    {
        [XmlAttribute(Constants.IdLowerCase)]
        public int Id { get; set; }

        [XmlAttribute(Constants.ModelLowerCase)]
        public string Model { get; set; }

        [XmlAttribute(Constants.TraveledDistanceKebabCase)]
        public long TraveledDistance { get; set; }
    }
}
