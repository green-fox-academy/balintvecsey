import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 21..
 */
public class e17 {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write five numbers:");
        int a;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();
        int c;
        c = scanner.nextInt();
        int d;
        d = scanner.nextInt();
        int e;
        e = scanner.nextInt();
        System.out.println((a + b + c + d + e) / 5);
    }

}
