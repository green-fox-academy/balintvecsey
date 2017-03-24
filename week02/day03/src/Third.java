import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Bálint on 2017. 03. 22..
 */

public class Third {
  // - Create an array variable named `q`
  //   with the following content: `[4, 5, 6, 7]`
  // - Print the third element of `q`

  public static void main(String[] args) {
    third();
    third2();
    System.out.println("Third element is " + third());
    System.out.println("Third element is " + third2());
  }

  public static int third() {
    int[] q = {4, 5, 6, 7};
    return q[2];

    // You can simply convert the examples from this
    //int[] example = {1, 2, 3};
    // To this
    //ArrayList<Integer> converted = Arrays.asList(1, 2, 3);
  }

  public static int third2() {
    ArrayList<Integer> converted = new ArrayList(Arrays.asList(4, 5, 6, 7));
    return converted.get(2);
  }
}