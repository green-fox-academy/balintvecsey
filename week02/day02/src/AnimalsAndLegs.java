import java.util.Scanner;

/**
 * Created by Bálint on 2017. 03. 21..
 */
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens you have?");
        int chickens;
        chickens = scanner.nextInt();
        System.out.println("How many pigs you have?");
        int pigs;
        pigs = scanner.nextInt();
        int legs = (chickens * 2) + (pigs * 4);
        System.out.println(legs + " legs.2");
    }
}
