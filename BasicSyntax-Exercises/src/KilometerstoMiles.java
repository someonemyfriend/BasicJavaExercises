import java.util.Scanner;

//Write a program that reads kilometers (real number) from the console and converts them
//        to miles. Print the result on the console. 1 kilometer is equal to 0.621371192 miles.
public class KilometerstoMiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilometrs = Integer.parseInt(scan.nextLine());
        double miles = kilometrs * 0.621371192;
        System.out.print(miles);
    }
}
