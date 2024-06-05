
import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex3Browser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String currentURL = "";

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Home")) {
                break;
            } else if (command.equals("back")) {
                if (!stack.isEmpty()) {
                    currentURL = stack.pop();
                } else {
                    System.out.println("no previous URLs");
                    continue;
                }
            } else {
                if (!currentURL.isEmpty()) {
                    stack.push(currentURL);
                }
                currentURL = command;
            }

            System.out.println(currentURL);
        }

        scanner.close();
    }
}
