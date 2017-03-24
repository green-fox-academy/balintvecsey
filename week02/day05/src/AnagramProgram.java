import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 24..
 */
public class AnagramProgram {

  public static void main(String... args) {
    System.out.println("Type in a word, then another too!");
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
      System.out.println("Yeah. :)");
    }
    else {
      System.out.println("Nope. :(");
    }

    //System.out.println("Are they anagrams? ");
  }
  /*public static String Anagram() {
    Scanner scan = new Scanner(System.in);
    String firstWord = scan.nextLine();
    //String secondWord = scan.next();
    return firstWord;
  } */
}
