namespace CarManager.Tests
{
    using NUnit.Framework;
    using System;
    using System.Runtime.ConstrainedExecution;

    [TestFixture]
    public class CarManagerTests
    {
        const string _make = "make";
        const string _model = "model";
        const double _consumption = 2;
        const double _capacity = 100;
        Car car;
        [SetUp]
        public void Setup()
        {
            car = new(_make, _model, _consumption, _capacity);
        }

        [Test]
        public void TestConstructor()
        {
            Assert.AreEqual(_make, car.Make);
            Assert.AreEqual(_model, car.Model);
            Assert.AreEqual(_consumption, car.FuelConsumption);
            Assert.AreEqual(_capacity, car.FuelCapacity);
        }
        [Test]
        public void CarShouldBeCreatedWithZeroFuelAmount()
        {
            Assert.AreEqual(0, car.FuelAmount);
        }
        [TestCase("")]
        [TestCase(null)]
        public void SettingMakeWithEmptyShouldThorwException(string make)
        {
            Assert.Throws<ArgumentException>(() => new Car(make, _model, _consumption, _capacity), "Make cannot be null or empty!");
        }
        [TestCase("")]
        [TestCase(null)]
        public void SettingModelWithEmptyShouldThorwException(string model)
        {
            Assert.Throws<ArgumentException>(() => new Car(_make, model, _consumption, _capacity), "Model cannot be null or empty!");
        }

        [TestCase(0)]
        [TestCase(-5)]
        public void SettingFuleConsumptionWithNegativeShouldThorwException(double consumption)
        {
            Assert.Throws<ArgumentException>(() => new Car(_make, _model, consumption, _capacity), "Fuel consumption cannot be zero or negative!");
        }

        [TestCase(0)]
        [TestCase(-5)]
        public void SettingFuleCapacityWithNegativeShouldThorwException(double capacity)
        {
            Assert.Throws<ArgumentException>(() => new Car(_make, _model, _consumption, capacity), "Fuel capacity cannot be zero or negative!");
        }
        [Test]
        public void SettingFuelAmountShouldThrowExceptionIfIsNegative()
        {
            Assert.Throws<InvalidOperationException>(() => car.Drive(50), "Fuel amount cannot be negative!");
        }

        [Test]
        public void RefuelCalculateAmountCorrectly()
        {
            car.Refuel(10);
            Assert.AreEqual(10, car.FuelAmount);
        }
        [Test]
        public void OverRefuelCannotIncreaseAmountOverCapacity()
        {
            car.Refuel(999);
            Assert.AreEqual(_capacity, car.FuelAmount);
        }
        [TestCase(0)]
        [TestCase(-5)]
        public void SettingFuelToRefuelWithNegativeShouldThorwException(double refuelAmount)
        {
            Assert.Throws<ArgumentException>(() => car.Refuel(refuelAmount), "Fuel amount cannot be zero or negative!");
        }

        [Test]
        public void IfCannotDriveTheDistanceShouldThorwException()
        {
            Assert.Throws<InvalidOperationException>(() => car.Drive(50), "You don't have enough fuel to drive!");
        }
        [TestCase(2500,50)]
        [TestCase(5000,0)]
        public void DriveCalculateAmountCorrectly(double drive , double expected)
        {
            car.Refuel(100);
            car.Drive(drive);
            Assert.AreEqual(expected, car.FuelAmount);
        }
    }
}