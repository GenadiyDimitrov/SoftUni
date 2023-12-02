namespace Boardgames.DataProcessor
{
    using System.ComponentModel.DataAnnotations;
    using System.Text;
    using Boardgames.Data;
    using Boardgames.Data.Models;
    using Boardgames.Data.Models.Enums;
    using Boardgames.DataProcessor.ImportDto;

    public class Deserializer
    {
        private const string ErrorMessage = "Invalid data!";

        private const string SuccessfullyImportedCreator
            = "Successfully imported creator – {0} {1} with {2} boardgames.";

        private const string SuccessfullyImportedSeller
            = "Successfully imported seller - {0} with {1} boardgames.";

        public static string ImportCreators(BoardgamesContext context, string xmlString)
        {
            ImportCreatorDto[] importCreatorDtos = xmlString.DeserializeFromXml<ImportCreatorDto[]>("Creators");
            StringBuilder stringBuilder = new();
            List<Creator> creatorList = new();
            foreach (var importCreatorDto in importCreatorDtos)
            {
                if (!IsValid(importCreatorDto))
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }

                Creator creator = new()
                {
                    FirstName = importCreatorDto.FirstName,
                    LastName = importCreatorDto.LastName,
                };
                foreach (var boardgameDto in importCreatorDto.Boardgames)
                {
                    if (!IsValid(boardgameDto))
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }
                    else
                    {
                        creator.Boardgames.Add(new()
                        {
                            CategoryType = (CategoryType)boardgameDto.CategoryType,
                            Mechanics = boardgameDto.Mechanics,
                            Name = boardgameDto.Name,
                            Rating = boardgameDto.Rating,
                            YearPublished = boardgameDto.YearPublished
                        });
                    }
                }
                creatorList.Add(creator);
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedCreator, creator.FirstName, creator.LastName, creator.Boardgames.Count));
            }
            context.Creators.AddRange(creatorList);
            context.SaveChanges();
            return stringBuilder.ToString();
        }

        public static string ImportSellers(BoardgamesContext context, string jsonString)
        {
            ImportSellerDto[] importSellerDtos = jsonString.DeserializeFromJson<ImportSellerDto[]>();
            StringBuilder stringBuilder = new();
            List<Seller> sellersList = new();
            int[] boardgamesIds = context.Boardgames.Select(s => s.Id).ToArray();
            foreach (var importSellerDto in importSellerDtos)
            {
                if (!IsValid(importSellerDto))
                {
                    stringBuilder.AppendLine(ErrorMessage);
                    continue;
                }

                Seller seller = new()
                {
                    Address = importSellerDto.Address,
                    Country = importSellerDto.Country,
                    Name = importSellerDto.Name,
                    Website = importSellerDto.Website,
                };
                foreach (var boardgameId in importSellerDto.Boardgames.Distinct())
                {
                    if (!boardgamesIds.Contains(boardgameId))
                    {
                        stringBuilder.AppendLine(ErrorMessage);
                        continue;
                    }
                    else
                    {
                        seller.BoardgamesSellers.Add(new()
                        {
                            BoardgameId = boardgameId,
                        });
                    }
                }
                sellersList.Add(seller);
                stringBuilder.AppendLine(string.Format(SuccessfullyImportedSeller, seller.Name, seller.BoardgamesSellers.Count));
            }
            context.Sellers.AddRange(sellersList);
            context.SaveChanges();
            return stringBuilder.ToString();
        }

        private static bool IsValid(object dto)
        {
            var validationContext = new ValidationContext(dto);
            var validationResult = new List<ValidationResult>();

            return Validator.TryValidateObject(dto, validationContext, validationResult, true);
        }
    }
}
