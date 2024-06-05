

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11BasicQueueOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of elements to enqueue
        int S = scanner.nextInt(); // Number of elements to dequeue
        int X = scanner.nextInt(); // Element to check
        scanner.nextLine(); // Consume newline

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        for (int i = 0; i < N; i++) {
            queue.offer(scanner.nextInt());
        }

        // Dequeue elements
        for (int i = 0; i < S; i++) {
            queue.poll();
        }

        // Check element X
        if (queue.contains(X)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                int min = Integer.MAX_VALUE;
                for (int num : queue) {
                    min = Math.min(min, num);
                }
                System.out.println(min);
            }
        }

        scanner.close();
    }
}
