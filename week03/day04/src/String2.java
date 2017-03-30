/**
 * Created by Bálint on 2017. 03. 30..
 */
public class String2 {

  // Given a string, compute recursively a new string where all the 'x' chars have been removed.
  public static void main(String[] args) {
    System.out.println(text("Boxxxer"));
  }

  public static String text(String x) {
    if (x.length() < 1) {
      return "";
    }
    else if (x.charAt(x.length() - 1) == 'x') {
      return text(x.substring(0, x.length() - 1));
    }
    else
      return text(x.substring(0, x.length() - 1)) + x.substring(x.length() - 1);
  }
}
