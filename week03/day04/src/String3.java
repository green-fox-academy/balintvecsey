/**
 * Created by Bálint on 2017. 03. 30..
 */
public class String3 {

  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    System.out.println(text("Boxxxer"));
  }

  public static String text(String x) {
    if (x.length() < 1) {
      return "";
    }
    else
      return text(x.substring(0, x.length() - 1)) + x.substring(x.length() - 1) + "*";
  }
}
