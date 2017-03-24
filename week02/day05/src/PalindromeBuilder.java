import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 24..
 */
public class PalindromeBuilder {

  public static void main(String[] args) {
    System.out.println("Type a word!");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();

    if (word.isEmpty()) {
      System.out.println("");
    }

    System.out.println(createPalindrome(word));
  }

  public static String createPalindrome(String word) {
    StringBuilder rev = new StringBuilder(word);
    return word + rev.reverse();
  }
}
