//Calculate the fuel efficiency of a car given the total distance traveled D in kilometers and the
//total fuel consumed F in liters.
//Use the formula: Fuel Efficiency = D / F
//On the first line, you receive the distance D in kilometers.
//On the second line, you receive the fuel F in liters.

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distance = Double.parseDouble(scan.nextLine());
        double fuel = Double.parseDouble(scan.nextLine());

        double formula = (distance / fuel) ;
        System.out.println(String.format("%.2f", formula));
    }
}
