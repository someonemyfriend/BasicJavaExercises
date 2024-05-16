import java.util.Scanner;

//For the furnishing of the office purchased 3 cabinets. One cabinet cost $n, the second
//        was 20% cheaper than the first, and the third cost 15% more than the other two
//        combined.
//        From the console read the cost of the first cabinet – a real number.
//        The output must be rounded to the third decimal point.
public class Office {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstCabinetPrice = Double.parseDouble(scan.nextLine());
        double discountForSecond = firstCabinetPrice * 0.2;
        double secondCabinetPrice = firstCabinetPrice - discountForSecond;
        double sum = firstCabinetPrice + secondCabinetPrice;
        double addMoreMoney = (sum * 15)/100;
        double thirdCabinetPrice = firstCabinetPrice + secondCabinetPrice + addMoreMoney;
        double sumOfAll = sum + thirdCabinetPrice;

        System.out.println(String.format("%.3f", sumOfAll));
    }
}
