/**
 * Created by Bálint on 2017. 03. 30..
 */
public class Numberadder {

  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
  public static void main(String[] args) {
    System.out.println(adder(6));
  }

  public static int adder(int n) {
    n--;
    if (n < 0){
      return 0;
    }
    else {
      return n + adder(n);
    }
  }
}
