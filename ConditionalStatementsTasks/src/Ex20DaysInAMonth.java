//Write a console program that takes a month number (1 to 12) as input and outputs the
//number of days in that month. Assume it's not a leap year.

import java.util.Scanner;

public class Ex20DaysInAMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numMonth = Integer.parseInt(scan.nextLine());

        if(numMonth == 1){
            System.out.println(31);
        } else if (numMonth == 2) {
            System.out.println(28);
        } else if (numMonth == 3) {
            System.out.println(31);
        } else if (numMonth == 4) {
            System.out.println(30);
        } else if (numMonth == 5) {
            System.out.println(31);
        } else if (numMonth == 6) {
            System.out.println(30);
        } else if (numMonth == 7) {
            System.out.println(31);
        } else if (numMonth == 8) {
            System.out.println(31);
        } else if (numMonth == 9) {
            System.out.println(30);
        } else if (numMonth == 10) {
            System.out.println(31);
        } else if (numMonth == 11) {
            System.out.println(30);
        } else if (numMonth == 12) {
            System.out.println(31);
        }
    }
}
