using System.Xml.Serialization;

namespace Boardgames.DataProcessor.ExportDto
{
    [XmlType("Creator")]
    public class ExportCreatorDto
    {
        public string CreatorName { get; set; }
        [XmlAttribute]
        public int BoardgamesCount { get; set; }
        [XmlArray]
        public ExportBoardgameDto[] Boardgames { get; set; }
    }
}
