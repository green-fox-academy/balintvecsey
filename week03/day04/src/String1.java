/**
 * Created by Bálint on 2017. 03. 30..
 */
public class String1 {

  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    System.out.println(text("Boxxxer"));
  }

  public static String text(String x) {
    if (x.length() < 1){
      return "";
    }
    else if (x.charAt(x.length() - 1) == 'x'){
      return text(x.substring(0, x.length()-1)) + "y";
    }
    else
      return text(x.substring(0, x.length()-1)) + x.substring(x.length()-1);
  }
}
