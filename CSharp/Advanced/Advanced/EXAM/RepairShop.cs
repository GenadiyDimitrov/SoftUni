namespace AutomotiveRepairShop
{
    public class RepairShop
    {
        public int Capacity { get; set; }
        public List<Vehicle> Vehicles
        {
            get { return _vehicles; }
            set { _vehicles = value; }
        }
        private List<Vehicle> _vehicles;

        public RepairShop(int capacity)
        {
            Capacity = capacity;
            _vehicles = new();
        }
        public bool AddVehicle(Vehicle vehicle)
        {
            if (_vehicles.Count + 1 <= Capacity)
            {
                _vehicles.Add(vehicle);
                return true;
            }
            return false;
        }
        public bool RemoveVehicle(string vin)
        {
            if (_vehicles.FirstOrDefault(v => v.VIN.Equals(vin)) is Vehicle vehicle)
            {
                _vehicles.Remove(vehicle);
                return true;
            }
            return false;
        }
        public int GetCount()
        {
            return _vehicles.Count;
        }
        public Vehicle GetLowestMileage()
        {
            return _vehicles.OrderBy(v => v.Mileage).First();
        }
        public string Report()
        {
            return
                $"Vehicles in the preparatory:{Environment.NewLine}" +
                string.Join(Environment.NewLine, _vehicles);
        }
    }
}
