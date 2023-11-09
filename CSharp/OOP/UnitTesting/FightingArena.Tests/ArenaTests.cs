namespace FightingArena.Tests
{
    using NUnit.Framework;
    using System;

    [TestFixture]
    public class ArenaTests
    {
        Warrior _mainWarrior;
        Warrior _dummy;
        Arena _arena;
        const string _playerName = "Player";
        const string _dummyName = "Dummy";

        [SetUp]
        public void Setup()
        {
            _arena = new Arena();
            _mainWarrior = new Warrior(_playerName, 100, 1000);
            _dummy = new Warrior(_dummyName, 20, 200);
        }

        [Test]
        public void ArenaShouldGenerateEmptyList()
        {
            Assert.AreEqual(0, _arena.Warriors.Count);
        }
        [Test]
        public void ArenaCountShouldReturnCorrectCount()
        {
            _arena.Enroll(_dummy);
            _arena.Enroll(_mainWarrior);
            Assert.AreEqual(2, _arena.Count);
        }
        [Test]
        public void ArenaWarriorsShouldReturnCorrectCount()
        {
            _arena.Enroll(_dummy);
            _arena.Enroll(_mainWarrior);
            Assert.AreEqual(2, _arena.Warriors.Count);
        }
        [Test]
        public void ArenaShouldEnrollCorrectly()
        {
            _arena.Enroll(_dummy);
            _arena.Enroll(_mainWarrior);
            Assert.AreEqual(2, _arena.Warriors.Count);
        }
        [Test]
        public void ArenaShouldThrowIfEnrollSameWarrior()
        {
            _arena.Enroll(_dummy);
            Assert.Throws<InvalidOperationException>(() => _arena.Enroll(_dummy), "Warrior is already enrolled for the fights!");
        }

        [Test]
        public void FightShouldAttackCorrectyl()
        {
            _arena.Enroll(_dummy);
            _arena.Enroll(_mainWarrior);
            _arena.Fight(_playerName, _dummyName);
            Assert.AreEqual(980, _mainWarrior.HP);
            Assert.AreEqual(100, _dummy.HP);
        }
        [Test]
        public void FightShouldThrowIfAttackerIsMissing()
        {
            string missingName = "TestAttacker";
            Assert.Throws<InvalidOperationException>(() => _arena.Fight(missingName, _dummyName), $"There is no fighter with name {missingName} enrolled for the fights!");
        }
        [Test]
        public void FightShouldThrowIfDeffenderIsMissing()
        {
            string missingName = "TestDeffender";
            Assert.Throws<InvalidOperationException>(() => _arena.Fight(_playerName, missingName), $"There is no fighter with name {missingName} enrolled for the fights!");
        }
        [Test]
        public void FightShouldThrowIfBothAreMissing()
        {
            string missingName = "TestDeffender";
            Assert.Throws<InvalidOperationException>(() => _arena.Fight("TestAttacker", missingName), $"There is no fighter with name {missingName} enrolled for the fights!");
        }
    }
}
