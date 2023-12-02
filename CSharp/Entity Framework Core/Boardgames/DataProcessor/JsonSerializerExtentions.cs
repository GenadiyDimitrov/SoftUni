namespace Boardgames.DataProcessor
{
    public static class JsonSerializerExtentions
    {
        public static T DeserializeFromJson<T>(this string jsonString)
        {
            return System.Text.Json.JsonSerializer.Deserialize<T>(jsonString, new System.Text.Json.JsonSerializerOptions()
            {
                NumberHandling = System.Text.Json.Serialization.JsonNumberHandling.AllowReadingFromString,

                WriteIndented = true,
            });
        }
        public static string SerializeToJson(this object obj)
        {
            return System.Text.Json.JsonSerializer.Serialize(obj, new System.Text.Json.JsonSerializerOptions()
            {

                NumberHandling = System.Text.Json.Serialization.JsonNumberHandling.AllowReadingFromString,
                WriteIndented = true,
            });
        }
    }
}
