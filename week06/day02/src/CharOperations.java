/**
 * Created by Bálint on 2017. 04. 18..
 */
public class CharOperations implements CharSequence {
  String reverse;

  public static void main(String[] args) {
    CharOperations word = new CharOperations("alma");

    System.out.println(word.charAt(1));
  }

  public CharOperations(String line) {
    this.reverse = line;
  }

  @Override
  public int length() {
    return reverse.length();
  }

  @Override
  public char charAt(int index) {
    return reverse.charAt(reverse.length() - (index + 1));
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
