import java.util.Scanner;

public class Ex23MovieClassification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());

        if(age <= 13) {
            System.out.println("U-rated movies");
        } else if(age >= 14 && age <= 17) {
            System.out.println("U and PG-13 rated movies");
        } else if(age >= 18) {
            System.out.println("All movies");
        }
    }
}
