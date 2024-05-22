//Write a function that receives two numbers and an operation and prints the result of it.
// add +
// subtract -
// divide /
// multiply *
//Format the result to two decimal places.

import java.util.Scanner;

public class Ex12SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNum = Double.parseDouble(scan.nextLine());
        double secondNum = Double.parseDouble(scan.nextLine());
        String operation = scan.nextLine();

        if (operation.equals("add")) {
            double sum = firstNum + secondNum;
            System.out.printf("%.2f", sum);
        } else if (operation.equals("subtract")) {
            double sum = firstNum - secondNum;
            System.out.printf("%.2f", sum);
        } else if (operation.equals("divide")) {
            double sum = firstNum / secondNum;
            System.out.printf("%.2f", sum);
        } else if (operation.equals("multiply")) {
            double sum = firstNum * secondNum;
            System.out.printf("%.2f", sum);
        }

    }

}
