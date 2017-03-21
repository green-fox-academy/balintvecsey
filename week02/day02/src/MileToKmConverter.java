import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 21..
 */
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a distance in kilometers, please!");
        double distance;
        distance = scanner.nextDouble();
        double miles = (double) (distance * 0.6213);
        System.out.println(miles);
    }
}
