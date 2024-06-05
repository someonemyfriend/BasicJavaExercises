
import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex4SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] tokens = expression.split(" ");

        int currentNumber = 0;
        char currentOperator = '+';

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-")) {
                currentOperator = token.charAt(0);
            } else {
                currentNumber = Integer.parseInt(token);
                if (currentOperator == '+') {
                    stack.push(currentNumber);
                } else if (currentOperator == '-') {
                    stack.push(-currentNumber);
                }
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.println(result);
    }
}
