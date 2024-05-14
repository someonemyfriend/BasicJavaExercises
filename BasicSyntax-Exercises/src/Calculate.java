//Write a program that reads two integers "numOne" and "numTwo". Following the
//        described sequence, find and print:
//         Sum of numbers
//         Difference Between Numbers
//         Multiplication
//         Moderately arrhythmic

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());

        int sum = numOne + numTwo;
        int difference = numOne - numTwo;
        int product = numOne * numTwo;
        double average = sum / 2.0;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.printf(String.format("The average is: %.6f", average));
    }
}
