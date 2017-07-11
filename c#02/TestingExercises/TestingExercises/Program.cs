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
            string word1 = "alma";
            string word2 = "lama";

            Console.WriteLine(Anagram(word1, word2));
            Console.ReadLine();
        }

        public static bool Anagram(string word1, string word2)
        {
            char[] chars1 = word1.ToCharArray();
            char[] chars2 = word2.ToCharArray();

            Array.Sort(chars1);
            Array.Sort(chars2);

            return chars1.SequenceEqual(chars2);
        }
    }
}
