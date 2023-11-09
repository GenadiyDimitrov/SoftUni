namespace Database.Tests
{
    using NUnit.Framework;
    using System;

    [TestFixture]
    public class DatabaseTests
    {
        private Database _database;
        [SetUp]
        public void Setup()
        {
            _database = new Database(1, 2);
        }
        [Test]
        public void CreatingDatabeseCountShouldBeCorrect()
        {
            int expectedResult = 2;

            int actualResult = _database.Count;

            Assert.AreEqual(expectedResult, actualResult);
        }
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7 })]
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 })]
        public void CreatingDataBaseShouldAddEllementsCorrectly(int[] data)
        {
            _database = new Database(data);
            int[] actualResult = _database.Fetch();

            Assert.AreEqual(data, actualResult);
        }
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 })]
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20 })]
        public void CreatingDataBaseShouldThrowExceptionWhenCountMoreThan16(int[] data)
        {
            Assert.Throws<InvalidOperationException>(() => _database = new Database(data), "Array's capacity must be exactly 16 integers!");
        }
        [Test]
        public void DatabaseShouldWorkCorrectly()
        {
            int expectedResult = 2;

            int actualResult = _database.Count;

            Assert.AreEqual(expectedResult, actualResult);

        }
        [Test]
        public void DatabaseCountShouldIncreaseAfterAddMethod()
        {
            _database.Add(1);

            Assert.AreEqual(3, _database.Count);
        }
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 })]
        public void AddingShouldThrowExceptionWhenCountMoreThan16(int[] data)
        {
            _database = new Database(data);
            Assert.Throws<InvalidOperationException>(() => _database.Add(17), "Array's capacity must be exactly 16 integers!");
        }

        [Test]
        public void DatabaseCountShouldDecreaseAfterRemoveMethod()
        {
            _database.Remove();

            Assert.AreEqual(1, _database.Count);
        }
        [Test]
        public void DatabaseCountShouldRemoveElementsCorrectly()
        {
            _database.Remove();
            _database.Remove();

            Assert.AreEqual(Array.Empty<int>(), _database.Fetch());
        }

        [Test]
        public void DatabaseShouldTrowExceptionAfterRemoveMethodWhenCountIs0()
        {
            _database.Remove();
            _database.Remove();

            Assert.Throws<InvalidOperationException>(()
                => _database.Remove(),
                "The collection is empty!");
        }
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7 })]
        [TestCase(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 })]
        public void DatabaseShouldReturnSameAsData(int[] data)
        {
            _database = new Database(data);
            int[] actualResult = _database.Fetch();

            Assert.AreEqual(data, actualResult);
        }
    }
}
