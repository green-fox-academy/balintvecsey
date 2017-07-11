using Microsoft.VisualStudio.TestTools.UnitTesting;
using TestingExercises;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestingExercises.Tests
{
    [TestClass()]
    public class AnagramTests
    {
        Anagram anagram;
        string word1;
        string word2;

        public AnagramTests()
        {
            anagram = new Anagram();
        }

        [TestMethod()]
        public void TestAnagramTrue()
        {
            word1 = "alma";
            word2 = "lama";

            Assert.IsTrue(anagram.IsAnagram(word1, word2));
        }

        [TestMethod()]
        public void TestAnagramFalse()
        {
            word1 = "palma";
            word2 = "lama";

            Assert.IsFalse(anagram.IsAnagram(word1, word2));
        }

        [TestMethod()]
        public void TestAnagramUppercaseLetters()
        {
            word1 = "aLMa";
            word2 = "lAmA";

            Assert.IsTrue(anagram.IsAnagram(word1, word2));
        }

        [TestMethod()]
        [ExpectedException(typeof(NullReferenceException))]
        public void TestAnagramWithNull()
        {
            word1 = "aLMa";
            word2 = null;

            anagram.IsAnagram(word1, word2);
        }
    }

    [TestClass()]
    public class CountTests
    {
        Count count;
        Dictionary<char, long> test;
        string word;

        public CountTests()
        {
            count = new Count();
            test = new Dictionary<char, long>();
        }

        [TestMethod()]
        public void TestCountLetters()
        {
            word = "alma";
            Dictionary<char, long> test2 = count.CountLetters(word);
            test.Add('a', 2);
            test.Add('l', 1);
            test.Add('m', 1);

            Assert.AreEqual(test['a'], test2['a']);
            Assert.AreEqual(test['l'], test2['l']);
            Assert.AreEqual(test['m'], test2['m']);
        }
    }

    [TestClass()]
    public class FibonacciTests
    {
        Fibonucci number;

        public FibonacciTests()
        {
            number = new Fibonucci();
        }

        [TestMethod()]
        public void TestWith1()
        {
            Assert.AreEqual(1, number.Fibonum(1));
        }

        [TestMethod()]
        public void TestWith2()
        {
            Assert.AreEqual(1, number.Fibonum(2));
        }

        [TestMethod()]
        public void TestWithN()
        {
            Assert.AreEqual(1597, number.Fibonum(17));
        }

        [TestMethod()]
        public void TestWithNegative()
        {
            Assert.AreEqual(-1, number.Fibonum(-7));
        }
    }
}
