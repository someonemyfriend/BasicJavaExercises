//need to think more here

import java.util.Scanner;

public class Ex18LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = Integer.parseInt(scan.nextLine());

        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);


        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

//        switch (year) {
//            case 2020:
//
//        }


//        if(year % 4 == 0) {
//            System.out.println("It‘s a leap year!");
//        } else {
//            System.out.println("It‘s not a leap year.");
//        }
//        if(year % 100 == 0) {
//            System.out.println("It‘s a leap year!");
//        }else{
//            System.out.println("It‘s not a leap year.");
//        }
//
//        if(year % 400 == 0) {
//            System.out.println("It‘s a leap year!");
//        }else{
//            System.out.println("It‘s not a leap year.");
//        }






    }
}
