//Write a console program that determines the price of a movie ticket based on age:
// Child (0-12 years): $5
// Teen (13-19 years): $8
// Adult (20+ years): $10

import java.util.Scanner;

public class Ex19MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());

        if (age >= 0 && age <= 12) {
            System.out.println("$5");
        } else if (age >= 13 && age <= 19) {
            System.out.println("$8");
        } else if (age >= 20) {
            System.out.println("$10");
        }

    }
}
