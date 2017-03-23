import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 23..
 */
public class Pyramid {
  // Write a program that reads a number from the standard input, then draws a
  // pyramid like this:
  //
  //
  //    *
  //   ***
  //  *****
  // *******
  //
  // The pyramid should have as many lines as the number was
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write down a number");

    int a = scanner.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= 2*i; k++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
