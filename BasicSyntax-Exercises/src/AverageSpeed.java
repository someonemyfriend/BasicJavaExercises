import java.util.Scanner;

//Calculate the average speed of a vehicle that has traveled a certain distance D in kilometers
//over a given time T in hours.
//Use the formula Average Speed = D / T.
//On the first line, you receive the distance D in kilometers.
//On the second line, you receive the time T in hours.
public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distance = Double.parseDouble(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());

        double formula = distance / time;
        System.out.println(String.format("%.2f", formula));
    }
}
