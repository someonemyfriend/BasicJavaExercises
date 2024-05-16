import java.util.Scanner;

//Calculate the daily water consumption per person in a household. Given the total water
//        consumption in liters for a week and the number of people in the household, find out the daily
//        consumption per person.
//        Use the formula
//        Daily consumption per person = Total weekly consumption / 7 / Number of people
public class WaterConsumption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weeklyConsumption = Double.parseDouble(scan.nextLine());
        double NumberOfPeople = Double.parseDouble(scan.nextLine());

        double formula = weeklyConsumption / 7 / NumberOfPeople;
        System.out.println(String.format("%.2f", formula));
    }
}
