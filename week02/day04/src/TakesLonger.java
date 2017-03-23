/**
 * Created by Bálint on 2017. 03. 23..
 */
public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    String p1quote = quote.substring(0, 20);
    String p2quote = quote.substring(20);
    String add = " always takes longer than";
    System.out.println(p1quote + add + p2quote);
  }
}
