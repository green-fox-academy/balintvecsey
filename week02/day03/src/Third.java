/**
 * Created by Bálint on 2017. 03. 22..
 */

public class Third {
  // - Create an array variable named `q`
  //   with the following content: `[4, 5, 6, 7]`
  // - Print the third element of `q`

  public static void main(String[] args) {
    third();
    System.out.println(third());
  }

  public static int third() {
    int[] q = {4, 5, 6, 7};
    return q[2];
  }
}