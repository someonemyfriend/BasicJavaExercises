
import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex7PrinterQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("print")) {
                break;
            } else if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Standby");
                } else {
                    System.out.println("Canceled " + queue.pollFirst());
                }
            } else {
                queue.offer(input);
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }

        scanner.close();
    }
}

