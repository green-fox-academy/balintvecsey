import java.util.Arrays;

/**
 * Created by Bálint on 2017. 03. 22..
 */
public class SwapElements {
  // - Create an array variable named `abc`
  //   with the following content: `["first", "second", "third"]`
  // - Swap the first and the third element of `abc`
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String a = abc[0];
    abc[0] = abc[2];
    abc[2] = a;

    System.out.println(Arrays.toString(abc));
  }
}
