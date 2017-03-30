/**
 * Created by Bálint on 2017. 03. 30..
 */
public class Bunnies2 {

  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
  // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
  public static void main(String[] args) {
    System.out.println(bunnyEars(4));
  }

  public static int bunnyEars(int n) {
    if (n == 1) {
      return 2;
    } else if (n % 2 != 0){
      return 2 + bunnyEars(n - 1);
    } else {
      return 3 + bunnyEars(n - 1);
    }
  }
}
