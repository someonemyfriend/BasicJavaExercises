
import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex2BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N, S, and X
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        // Read the N integers
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            stack.push(scanner.nextInt());
        }

        // Pop S elements from the stack
        for (int i = 0; i < S; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        // Check if X is in the stack
        if (stack.contains(X)) {
            System.out.println("true");
        } else {
            // If X is not found, find the smallest element in the stack
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                int smallest = Integer.MAX_VALUE;
                for (int num : stack) {
                    if (num < smallest) {
                        smallest = num;
                    }
                }
                System.out.println(smallest);
            }
        }

        scanner.close();
    }
}
