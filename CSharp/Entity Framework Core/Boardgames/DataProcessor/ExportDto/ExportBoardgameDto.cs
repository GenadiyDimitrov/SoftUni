using System.Text.Json.Serialization;
using System.Xml.Serialization;

namespace Boardgames.DataProcessor.ExportDto
{
    [XmlType("Boardgame")]
    public class ExportBoardgameDto
    {
        [XmlElement("BoardgameName")]
        public string Name { get; set; }
        [JsonIgnore]
        public int BoardgameYearPublished { get; set; }
        [XmlIgnore]
        public double Rating { get; set; }
        [XmlIgnore]
        public string Mechanics { get; set; }
        [XmlIgnore]
        public string Category { get; set; }
    }
}
