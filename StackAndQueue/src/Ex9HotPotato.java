
import java.util.ArrayDeque;
        import java.util.Scanner;

public class Ex9HotPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the names of the children
        String[] children = scanner.nextLine().split(" ");
        // Read the number n (every nth toss the child is removed)
        int n = scanner.nextInt();

        ArrayDeque<String> queue = new ArrayDeque<>();

        // Add all children to the queue
        for (String child : children) {
            queue.offer(child);
        }

        // Simulate the game
        while (queue.size() > 1) {
            // Pass the potato n-1 times
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            // Remove the nth child
            System.out.println("Removed " + queue.poll());
        }

        // Print the last remaining child
        System.out.println("Last is " + queue.poll());
    }
}
