import java.util.Scanner;

public class Ex22DiscountCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        String membership = scan.nextLine();

        if(age < 18) {
            System.out.println("10% discount");
        } else if (age >= 18 && age <= 64) {
            if(membership.equals("Yes")) {
                System.out.println("20% discount");
            } else if(membership.equals("No")) {
                System.out.println("10% discount");
            }
        } else if(age >= 65) {
            System.out.println("30% discount");
        }
    }
}
