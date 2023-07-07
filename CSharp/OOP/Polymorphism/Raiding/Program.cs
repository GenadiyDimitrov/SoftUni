namespace Raiding
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int count = int.Parse(Console.ReadLine());
            List<IHero> heroes = new();
            while (heroes.Count < count)
            {
                try
                {
                    heroes.Add(GetHero());
                }
                catch (ArgumentException ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
            int health = int.Parse(Console.ReadLine());
            foreach (var hero in heroes)
            {
                health -= hero.Power;
                hero.CastAbility();
            }
            Console.WriteLine(health <= 0 ? "Victory!" : "Defeat...");

        }

        private static IHero GetHero()
        {
            try
            {
                string name = Console.ReadLine();
                return GetHero(Console.ReadLine(), name);
            }
            catch (ArgumentException)
            {
                throw;
            }

        }
        private static IHero GetHero(string type, string name)
        {
            switch (type)
            {
                case "Warrior":
                    return new Warrior(name);
                case "Rogue":
                    return new Rogue(name);
                case "Druid":
                    return new Druid(name);
                case "Paladin":
                    return new Paladin(name);
                default:
                    throw new ArgumentException("Invalid hero!");
            }
        }
    }
}