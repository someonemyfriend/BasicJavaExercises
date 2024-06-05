

import java.util.ArrayDeque;
        import java.util.Deque;
        import java.util.Scanner;

public class Ex10MaximumElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Deque<Integer> stack = new ArrayDeque<>();
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            String[] command = scanner.nextLine().split(" ");
            int type = Integer.parseInt(command[0]);

            switch (type) {
                case 1:
                    int x = Integer.parseInt(command[1]);
                    stack.push(x);
                    maxElement = Math.max(maxElement, x);
                    break;
                case 2:
                    int removed = stack.pop();
                    if (removed == maxElement) {
                        maxElement = findNewMax(stack);
                    }
                    break;
                case 3:
                    System.out.println(maxElement);
                    break;
            }
        }

        scanner.close();
    }

    private static int findNewMax(Deque<Integer> stack) {
        int max = Integer.MIN_VALUE;
        for (int num : stack) {
            max = Math.max(max, num);
        }
        return max;
    }
}
