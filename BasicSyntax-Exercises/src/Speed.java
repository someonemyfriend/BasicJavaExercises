//Write a program that calculates the speed in meters per second and displays the result on
//        the console.
//        The input data are integers as follows:
//         Distance in meters
//         Hours
//         Minutes
//         Seconds
//
//        Use the formula V = S/T where V - speed, S - distance, T - time

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distanceInMeters = Integer.parseInt(scan.nextLine());
        int hoursInput = Integer.parseInt(scan.nextLine());
        int minutesInput = Integer.parseInt(scan.nextLine());
        int secondsInput = Integer.parseInt(scan.nextLine());

        int hoursToSeconds = hoursInput * 3600;
        int minutesToSeconds = minutesInput * 60;

        int sumSeconds = hoursToSeconds + minutesToSeconds + secondsInput;

        int disDivisionTime = distanceInMeters / sumSeconds;

        System.out.println(sumSeconds);
        System.out.println(distanceInMeters);
        System.out.printf(String.format("The average is: %.6f", disDivisionTime));

    }
}
