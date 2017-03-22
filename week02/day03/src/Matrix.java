/**
 * Created by Bálint on 2017. 03. 22..
 */
public class Matrix {
  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output
  public static void main(String[] args) {
    int a[][] = {
      {1, 0, 0, 0},
      {0, 1, 0, 0},
      {0, 0, 1, 0},
      {0, 0, 0, 1}
    };

    for(int b = 0; b < a.length; b ++) {
      for(int c = 0; c < a.length; c ++) {
        System.out.print(a[b][c] + "\t");
      }
      System.out.println();
    }
  }
}
