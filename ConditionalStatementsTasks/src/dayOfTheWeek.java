//Write a function that receives an integer and prints a day of the week (in English), within
//the limits [1...7] or prints "Error" in case the entered number is invalid.

import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wnumber = Integer.parseInt(scan.nextLine());

        if(wnumber == 1) {
            System.out.println("Monday");
        } else if(wnumber == 2) {
            System.out.println("Tuesday");
        } else if(wnumber == 3) {
            System.out.println("Wednesday");
        } else if(wnumber == 4) {
            System.out.println("Thursday");
        } else if(wnumber == 5) {
            System.out.println("Friday");
        } else if(wnumber == 6) {
            System.out.println("Saturday");
        } else if(wnumber == 7) {
            System.out.println("Sunday");
        } else if(wnumber >= 8) {
            System.out.println("Error");
        } else if(wnumber <= 0) {
            System.out.println("Error");
        }

    }
}



