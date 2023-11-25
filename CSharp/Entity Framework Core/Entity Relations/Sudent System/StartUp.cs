using Microsoft.EntityFrameworkCore;
using P01_StudentSystem.Data;

namespace P01_StudentSystem
{
    internal class StartUp
    {
        public static void Main()
        {
            using StudentSystemContext context = new();
            context.Database.EnsureDeleted();
            context.Database.EnsureCreated();
            context.Database.Migrate();
        }
    }
}