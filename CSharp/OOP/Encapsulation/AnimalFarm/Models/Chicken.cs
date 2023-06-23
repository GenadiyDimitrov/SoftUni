using System;

namespace AnimalFarm.Models
{
    public class Chicken
    {
        private const int MinAge = 0;
        private const int MaxAge = 15;

        private string name;
        private int age;

        public Chicken(string name, int age)
        {
            Name = name;
            Age = age;
        }

        public string Name
        {
            get => this.name;

            private set
            {
                if (string.IsNullOrWhiteSpace(value))
                {
                    throw new ArgumentException($"{nameof(Name)} cannot be empty.");
                }
                this.name = value;
            }
        }

        public int Age
        {
            get => this.age;

            private set
            {
                if (value < MinAge || value > MaxAge)
                {
                    throw new ArgumentException($"{nameof(Age)} should be between {MinAge} and {MaxAge}.");
                }
                this.age = value;
            }
        }

        public double ProductPerDay => CalculateProductPerDay();
        private double CalculateProductPerDay()
        {
            return Age < 4 ? 1.5 : Age < 8 ? 2 : Age < 12 ? 1 : 0.75;
        }

        public override string ToString() => $"Chicken {Name} (age {Age}) can produce {ProductPerDay} eggs per day.";
    }
}
