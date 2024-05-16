import java.util.Scanner;

//Calculate the Body Mass Index (BMI) based on the given weight (in kilograms) and height (in
//        meters).
//        Use the formula BMI= Weight / Height 2 .
public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double bmi = weight / (height * height);

        System.out.println(String.format("%.2f", bmi));
    }
}
