/**
 * Created by Bálint on 2017. 03. 22..
 */
public class Factorio {
  //  Create the usual class wrapper
  //  and main method on your own.

  // - Create a function called `factorio`
  //   that returns it's input's factorial
  public static void main(String[] args) {
    System.out.println(factorioFunction(4));
  }

  public static int factorioFunction(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    return fact;

  }
}
