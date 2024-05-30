import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int sum = num + 1;

        int calc = num * sum;

        System.out.println(calc);


    }
}
