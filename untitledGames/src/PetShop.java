import java.util.Scanner;
public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        double dogFood = first * 2.50;
        double catFood = second * 4;
        double sumFood = dogFood + catFood;

        //int projects = Integer.parseInt(scan.nextLine());

        //int hoursOfWork = first + second;

        System.out.println(sumFood + " lv.");
    }
}
