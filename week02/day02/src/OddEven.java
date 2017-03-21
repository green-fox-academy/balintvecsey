import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 21..
 */
public class OddEven {
    // Write a program that reads a number form the standard input,
    // Than prints "Odd" if the number is odd, or "Even" it it is even.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down a number:");
        int number;
        number = scanner.nextInt();

        if (number%2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
