/**
 * Created by Bálint on 2017. 03. 30..
 */
public class Counter {

  // Write a recursive function that takes one parameter: n and counts down from n.
  public static void main(String[] args) {
    counterFunct(6);
  }

  public static int counterFunct(int n) {
    System.out.println(n--);
    if (n < 0){
      return 0;
    }
    else {
      return n + counterFunct(n);
    }
  }
}
