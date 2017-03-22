import java.util.Arrays;

/**
 * Created by Bálint on 2017. 03. 22..
 */
public class DoubleItems {
  // - Create an array variable named `ag`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Double all the values in the array
  public static void main(String[] args) {
    int[] ag = {3, 4, 5, 6, 7};
    ag[0] *= 2;
    ag[1] *= 2;
    ag[2] *= 2;
    ag[3] *= 2;
    ag[4] *= 2;
    System.out.println(Arrays.toString(ag));
  }
}
