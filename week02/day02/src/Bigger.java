import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 21..
 */
public class Bigger {
    // Write a program that asks for two numbers and prints the bigger one
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type two number:");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
}
