using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestingExercises
{
    class Program
    {
        static void Main(string[] args)
        {
            Anagram anagram = new Anagram();
            string word1 = "alma";
            string word2 = "lama";

            Console.WriteLine(anagram.IsAnagram(word1, word2));
            Console.ReadLine();
        }
    }

    public class Anagram
    {
        public bool IsAnagram(string word1, string word2)
        {
            char[] chars1 = word1.ToLower().ToCharArray();
            char[] chars2 = word2.ToLower().ToCharArray();

            Array.Sort(chars1);
            Array.Sort(chars2);

            return chars1.SequenceEqual(chars2);
        }
    }
}
