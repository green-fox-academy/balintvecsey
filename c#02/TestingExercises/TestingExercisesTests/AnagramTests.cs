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
}