namespace DatabaseExtended.Tests
{
    using ExtendedDatabase;
    using NUnit.Framework;
    using System;
    using System.Security.Cryptography.X509Certificates;

    [TestFixture]
    public class ExtendedDatabaseTests
    {
        private Database _database;
        private Person _person;
        private Person _person2;
        [SetUp]
        public void Setup()
        {
            _person = new(1, "one");
            _person2 = new(2, "two");
            _database = new Database(_person, _person2);
        }
        [TestCase(1, "one")]
        [TestCase(2, "two")]
        public void PersonConstructorSettingNameCorrectly(long id, string name)
        {
            _person = new(id, name);
            Assert.AreEqual(name, _person.UserName);
        }
        [TestCase(1, "one")]
        [TestCase(2, "two")]
        public void PersonConstructorSettingIdCorrectly(long id, string name)
        {
            _person = new(id, name);
            Assert.AreEqual(id, _person.Id);
        }


        [Test]
        public void DatabeseConstructorCountCorrectly()
        {
            Assert.AreEqual(2, _database.Count);
        }
        [TestCase(17)]
        [TestCase(20)]
        public void DatabeseConstrucTorthrowsErrorAfter16thPerson(int length)
        {
            Person[] people = new Person[length];
            for (int i = 0; i < length; i++)
            {
                people[i] = new(i, $"name_{i}");
            }
            Assert.Throws<ArgumentException>(() => new Database(people), "Provided data length should be in range [0..16]!");
        }

        [Test]
        public void AddMethodAddsCorrectly()
        {
            _database.Add(new(3, "three"));
            Assert.AreEqual(3, _database.Count);
        }
        [Test]
        public void AddMethodThrowsErrorAfter16thPerson()
        {
            for (int i = 0; i < 14; i++)
            {
                _database.Add(new(i + 3, $"name_{i + 3}"));
            }
            Assert.Throws<InvalidOperationException>(() => _database.Add(new(17, $"name_{17}")), "Array's capacity must be exactly 16 integers!");
        }
        [Test]
        public void AddMethodThrowsErrorAfterAddingSameUsername()
        {
            Assert.Throws<InvalidOperationException>(() => _database.Add(new(3, "one")), "There is already user with this username!");
        }
        [Test]
        public void AddMethodThrowsErrorAfterAddingSameId()
        {
            Assert.Throws<InvalidOperationException>(() => _database.Add(new(1, "three")), "There is already user with this Id!");
        }
        [Test]
        public void RemoveMethodDecreasesCount()
        {
            _database.Remove();
            Assert.AreEqual(1, _database.Count);
        }
        [Test]
        public void RemoveThrowsExceptionAfterNomorePeopleToRemove()
        {
            _database.Remove();
            _database.Remove();
            Assert.Throws<InvalidOperationException>(() => _database.Remove());
        }
        [Test]
        public void FindByUsernameWorksCorectly()
        {
            var result = _database.FindByUsername(_person.UserName);
            Assert.AreEqual(_person, result);
        }
        [Test]
        public void FindByIdWorksCorectly()
        {
            var result = _database.FindById(_person.Id);
            Assert.AreEqual(_person, result);
        }

        [Test]
        public void FindByUsernameThroesErrorWhenNull()
        {
            Assert.Throws<ArgumentNullException>(() => _database.FindByUsername(""), "Username parameter is null!");
        }
        [Test]
        public void FindByUsernameThroesErrorWhenMissing()
        {
            Assert.Throws<InvalidOperationException>(() => _database.FindByUsername("three"), "No user is present by this username!");
        }

        [Test]
        public void FindByIdThroesErrorWhenNegative()
        {
            Assert.Throws<ArgumentOutOfRangeException>(() => _database.FindById(-1), "Id should be a positive number!");
        }

        [Test]
        public void FindByIdThroesErrorWhenNoSuchId()
        {
            Assert.Throws<InvalidOperationException>(() => _database.FindById(3), "No user is present by this ID!");
        }
    }
}