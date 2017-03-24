import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 24..
 */
public class NumberGuesser {

  public static void main(String[] args) {
    System.out.println("I've the number between 1-100.");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    int myNumber = 17;
    if(number == myNumber) {
      System.out.println("Congratulations. You won!");
    }
    else if (number > myNumber){
      System.out.println("Too high.");
    }
    else if (number < myNumber) {
      System.out.println("Too low.");
    }

  }

}
