//Write a function that takes an hour and minutes of a 24-hour day and calculates what
//time it will be after 15 minutes. Print the result in hours: minutes format.
//Hours are always between 0 and 23, and minutes are always between 0 and 59. Hours
//are written in one or two digits.
//Minutes are always written with two digits, with a leading zero when necessary.
//Try to find out how to add 0s in front of a number here:
//https://www.google.com/search?q=java+print+number+with+leading+zeros

import java.util.Scanner;

public class Ex08AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int minutesPlus15 = minutes + 15;

        //System.out.println(minutesPlus15);

        if (minutesPlus15 >= 60) {
            hour++;
            //System.out.println(hour);
            int calculatemin = minutesPlus15 % 60;
            //System.out.println(calculatemin);
            if (hour == 24) {
                hour = 0;
            }
            System.out.println(String.format("%d:%02d", hour, calculatemin));
        } else {
            //System.out.println(hour);
            //System.out.println(minutesPlus15);
            if (hour == 24) {
                hour = 0;
            }
            System.out.println(String.format("%d:%02d", hour, minutesPlus15));
        }
    }
}


//prysnahme giiiii !!!