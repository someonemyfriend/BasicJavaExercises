import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fact = 1;
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
