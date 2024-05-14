import java.util.Scanner;
public class Greening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());

        double priceOfWholeArea = area * 7.61;
        double discount = priceOfWholeArea * 0.18;

        double priceWithDiscount = priceOfWholeArea - discount;

        System.out.println("The final price is: " + priceWithDiscount + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
