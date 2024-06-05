import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex1ReverseNumbersStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Use ArrayDeque to store the numbers in a stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push each number onto the stack
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        // Pop each number from the stack and print it
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        scanner.close();
    }
}
