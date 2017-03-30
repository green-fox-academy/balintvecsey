/**
 * Created by Bálint on 2017. 03. 30..
 */
public class recursionExample {

  public static void main(String[] args) {
    //dumbRecursion(1);
    count(10);
    factorial_loop(6);
    factorial_recursive(6);
  }

  /*public static void dumbRecursion1() {
    System.out.println("It's working!");
    dumbRecursion();
  }


  public static void dumbRecursion2(int i) {
    System.out.println(i++);
    dumbRecursion2(i);
  }

  public static void dumbRecursion(int i) {
    System.out.println("It's working! " + i++);
    if (i < 10) {
      dumbRecursion(i);
    }
    else {
      return;
    }
  }*/

  public static int count(int first){
    if (first < 0) {
      return 0;
    }
    else {
      //System.out.println(first);
      return first + count(--first);
    }
  }

  public static int factorial_loop(int n) {
    int factorial = 1;
    for(int i = 1; i<n+1; i++){
      factorial *= i;
    }
    return factorial;
  }

  public static int factorial_recursive(int n) {
    if(n == 1){
      return 1;
    }
    else{
      System.out.println();
      return n * factorial_recursive(n - 1);
    }
  }
}
