//Calculate the monthly electricity bill based on the number of units consumed and the rate per
//        unit. Additionally, a fixed charge of $10 is added to the bill.
//        Use the formula
//        Total Bill = ( Units consumed × Rate per unit ) + 10

// PLEASE READ THE TASK FIRST, VASILIA!

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double UnitsConsumed = Double.parseDouble(scan.nextLine());
        double RatePerUnit = Double.parseDouble(scan.nextLine());

        double formula = (UnitsConsumed * RatePerUnit) + 10;
        System.out.println(String.format("%.0f", formula));
    }
}
