import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 21..
 */
// Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a distance in kilometers, please!");
        double distance = scanner.nextDouble();
        double miles = distance * 0.621371;
        System.out.println(miles + " miles");
    }
}
