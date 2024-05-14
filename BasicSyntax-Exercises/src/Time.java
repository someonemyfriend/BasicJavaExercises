//Write a program that reads minutes (integer) and converts them into hours and minutes.
//        Print the result in HR:MM format.

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutes = Integer.parseInt(scan.nextLine());

        int minToHours = Math.round(minutes / 60);
        int minutesReal = Math.round(minutes % 60);

        System.out.println(String.format("%d:%d", minToHours, minutesReal));

    }
}
