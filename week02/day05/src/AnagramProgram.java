import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 24..
 */
public class AnagramProgram {

  public static void main(String[] args) {
    System.out.println("Type two words!");
    Scanner scan = new Scanner(System.in);
    String firstWord = scan.next();
    String secondWord = scan.next();

    Anagram(firstWord, secondWord);
    if (Anagram(firstWord, secondWord)) {
      System.out.print("They are anagrams.");
    }
    else {
      System.out.print("They are not anagrams.");
    }
  }

  public static boolean Anagram(String firstWord, String secondWord) {
    char[] chars1 = firstWord.toCharArray();
    Arrays.sort(chars1);
    String sorted1 = new String(chars1);
    char[] chars2 = secondWord.toCharArray();
    Arrays.sort(chars2);
    String sorted2 = new String(chars2);

    return sorted1.equals(sorted2);
  }
}
