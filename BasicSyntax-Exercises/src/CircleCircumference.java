//Calculate the circumference of a circle given its radius R.
//Use the formula: Circumference = 2 * pi * R
//On the first line, you receive the radius R.

import java.util.Scanner;

public class CircleCircumference {
    // Value of PI. We can also use Math.PI for a more accurate value.
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = Integer.parseInt(scan.nextLine());


        double formula = 2 * PI * radius;
        System.out.println(String.format("%.2f", formula));
    }
}
