import java.util.Scanner;

public class PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = Integer.parseInt(scan.nextLine());
        int calc = 0;
        // When number of terms is greater than 0
        int prev1 = 1;
        int prev2 = 1;

        // For loop to print Fibonacci series
        for (int i = 1; i <= sum; i++) {
            if (i > 2) {
                int num = prev1 + prev2;
                prev2 = prev1;
                prev1 = num;
                //System.out.print(num + " ");
                calc += num;
               // System.out.print(calc + "...");
            }

            // For first two terms
            if (i == 1) {
                //System.out.print(prev2 + " ");
                calc += 1;
               // System.out.print(calc + "...");
            }
            if (i == 2) {
                //System.out.print(prev1 + " ");
                calc += 1;
                //System.out.print(calc + "...");
            }
            //System.out.print(calc + "...");
        }
        System.out.print(calc);
    }
}
