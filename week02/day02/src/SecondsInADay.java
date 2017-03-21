/**
 * Created by Bálint on 2017. 03. 21..
 */
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables
        System.out.println((24 - currentHours) * 3600 + (60 - currentMinutes) * 60 + (60 - currentSeconds));
    }
}