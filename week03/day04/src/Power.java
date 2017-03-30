/**
 * Created by Bálint on 2017. 03. 30..
 */
public class Power {

  // Given base and n that are both 1 or more, compute recursively (no loops)
  // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static void main(String[] args) {
    System.out.println(nPower(3,3));
  }

  public static int nPower(int n, int x) {
    if (n == 1) {
      return 1;
    } else if (x == 1){
      return n;
    }
    else {
      return n * (nPower(n, x - 1));
    }
  }
}
