namespace FightingArena.Tests
{
    using NUnit.Framework;
    using System;

    [TestFixture]
    public class WarriorTests
    {
        Warrior _mainWarrior;
        Warrior _dummy;
        string _playerName = "Player";
        string _dummyName = "Dummy";

        [SetUp]
        public void Setup()
        {
            _mainWarrior = new Warrior(_playerName, 100, 1000);
            _dummy = new Warrior(_dummyName, 20, 200);
        }

        [Test]
        public void TestWarrior()
        {
            Assert.AreEqual(_playerName, _mainWarrior.Name);
            Assert.AreEqual(100, _mainWarrior.Damage);
            Assert.AreEqual(1000, _mainWarrior.HP);
        }

        [TestCase("")]
        [TestCase("  ")]
        [TestCase(null)]
        public void SettingNameWithNullShouldThrowException(string name)
        {
            Assert.Throws<ArgumentException>(() => new Warrior(name, 100, 1000), "Name should not be empty or whitespace!");
        }
        [TestCase(0)]
        [TestCase(-5)]
        public void SettingDamageWithNullShouldThrowException(int dmg)
        {
            Assert.Throws<ArgumentException>(() => new Warrior(_playerName, dmg, 1000), "Damage value should be positive!");
        }
        [Test]
        public void SettingHealthWithNullShouldThrowException()
        {
            Assert.Throws<ArgumentException>(() => new Warrior(_playerName, 100, -10), "HP should not be negative!");
        }

        [TestCase(30)]
        [TestCase(10)]
        public void AttackShouldThrowExceptionIfHPLessThanMinAtkHP(int hp)
        {
            _mainWarrior = new Warrior(_playerName, 100, hp);
            Assert.Throws<InvalidOperationException>(() => _mainWarrior.Attack(_dummy), "Your HP is too low in order to attack other warriors!");
        }
        [TestCase(30)]
        [TestCase(10)]
        public void AttackShouldThrowExceptionIfDummyHPLessThanMinAtkHP(int hp)
        {
            _dummy = new Warrior(_dummyName, 100, hp);
            Assert.Throws<InvalidOperationException>(() => _mainWarrior.Attack(_dummy), $"Enemy HP must be greater than 30 in order to attack him!");
        }
        [Test]
        public void AttackShouldThrowExceptionIfDummyDmgMoreThanHP()
        {
            _dummy = new Warrior(_dummyName, 1001, 200);
            Assert.Throws<InvalidOperationException>(() => _mainWarrior.Attack(_dummy), $"You are trying to attack too strong enemy");
        }
        [Test]
        public void AttackShouldDecreaseHPCorrectly()
        {
            _mainWarrior.Attack(_dummy);
            Assert.AreEqual(980, _mainWarrior.HP);
        }
        [Test]
        public void AttackShouldDecreaseDummyHPCorrectly()
        {
            _mainWarrior.Attack(_dummy);
            Assert.AreEqual(100, _dummy.HP);
        }
        [Test]
        public void AttackShouldNotDecreaseDummyHPMoreThanZero()
        {
            _mainWarrior = new Warrior(_playerName, 999, 1000);
            _mainWarrior.Attack(_dummy);

            Assert.AreEqual(0, _dummy.HP);
        }
    }
}