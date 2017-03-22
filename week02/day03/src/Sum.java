/**
 * Created by Bálint on 2017. 03. 22..
 */
public class Sum {

  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter
    System.out.println(sumFunction(5));
  }

  public static int sumFunction(int until ){
    int sum = 0;
    for (int i = 0; i <= until; i++) {
      sum = sum + i;
    }
    return sum;
  }

}
