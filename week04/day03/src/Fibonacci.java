/**
 * Created by Bálint on 2017. 04. 05..
 */
public class Fibonacci {

  public int fibonum(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return fibonum(n - 1) + fibonum(n - 2);
    }
  }
}
