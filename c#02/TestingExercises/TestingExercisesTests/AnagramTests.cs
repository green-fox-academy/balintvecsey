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
        public void TestWithAnagram()
        {
            word1 = "alma";
            word2 = "lama";

            Assert.IsTrue(anagram.IsAnagram(word1, word2));
        }
    }
}