import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 24..
 */
public class AnagramProgram {

  public static void main(String[] args) {
    Anagram();
  }

  public static void Anagram() {
    System.out.println("Type two words!");
    Scanner scan = new Scanner(System.in);
    String firstword = scan.next();
    String secondWord = scan.next();

    char[] chars1 = firstword.toCharArray();
    Arrays.sort(chars1);
    String sorted1 = new String(chars1);
    char[] chars2 = secondWord.toCharArray();
    Arrays.sort(chars2);
    String sorted2 = new String(chars2);

    if (sorted1.equals(sorted2)) {
      System.out.print("They are anagrams.");
    }
    else {
      System.out.print("They are not anagrams.");
    }
  }
}
