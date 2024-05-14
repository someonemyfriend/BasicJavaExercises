//Write a program that reads from the console city (text) and degrees (integer) and
//        displays the following message on the console: "Today in {city} it is {degrees}
//        degrees.".
//        Tip: use "printf" to format more easily or String.format();
import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String town = scan.nextLine();
        int degrees = Integer.parseInt(scan.nextLine());
        System.out.println(String.format("Tadoay in %s it is %d degrees", town, degrees));
        System.out.printf("Today in %s it is %d degrees", town, degrees);
    }
}
