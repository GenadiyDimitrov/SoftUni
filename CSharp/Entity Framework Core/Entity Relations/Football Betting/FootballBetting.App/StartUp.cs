using P02_FootballBetting.Data;
using Microsoft.EntityFrameworkCore;

namespace P02_FootballBetting.App
{
    public class StartUp
    {
        public static void Main(string[] args)
        {
            using FootballBettingContext context = new();
            context.Database.EnsureDeleted();
            context.Database.EnsureCreated();
            context.Database.Migrate();
        }
    }
}