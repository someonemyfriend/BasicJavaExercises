import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int reverse = 0;
        for (;num != 0; num=num/10) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}
