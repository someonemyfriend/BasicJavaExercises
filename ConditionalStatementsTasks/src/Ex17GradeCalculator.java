import java.util.Scanner;

public class Ex17GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num >= 90 && num <= 100 ) {
            System.out.printf("A");
        } else if (num >= 80 && num <= 89 ) {
            System.out.printf("B");
        } else if (num >= 70 && num <= 79 ) {
            System.out.printf("C");
        } else if (num >= 60 && num <= 69 ) {
            System.out.printf("D");
        } else if (num >= 0 && num <= 59 ) {
            System.out.printf("F");
        }


    }
}
