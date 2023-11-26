namespace CarDealer.Models
{
    using System.Collections.Generic;

    public class Car
    {
        public Car()
        {
            this.PartsCars = new HashSet<PartCar>();
        }

        public int Id { get; set; }

        public string Make { get; set; }

        public string Model { get; set; }

        public long TraveledDistance { get; set; }

        public ICollection<Sale> Sales { get; set; }
		
        public ICollection<PartCar> PartsCars { get; set; }
    }
}