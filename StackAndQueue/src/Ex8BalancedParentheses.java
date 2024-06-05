
import java.util.ArrayDeque;
        import java.util.Deque;
        import java.util.Scanner;

public class Ex8BalancedParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (isBalanced(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpened = stack.pop();

                if (!isMatchingPair(lastOpened, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');
    }
}
