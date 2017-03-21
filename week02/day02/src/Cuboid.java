/**
 * Created by Bálint on 2017. 03. 21..
 */
public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double a = 12.3;
        double b = 15.6;
        double c = 22.2;

        System.out.println("Surface Area: " + (a * b + a * c + b * c) * 2);
        System.out.println("Volume: " + a * b * c);
    }
}
