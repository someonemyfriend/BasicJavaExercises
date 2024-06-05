
import java.util.Scanner;
        import java.util.Stack;

public class Ex13DocumentEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("End")) {
                break;
            } else if (command.startsWith("Insert")) {
                String text = command.substring(8, command.length() - 2); // Extract text from command
                undoStack.push(text);
                printDocument(undoStack);
            } else if (command.equals("Undo")) {
                if (!undoStack.isEmpty()) {
                    String undoneText = undoStack.pop();
                    redoStack.push(undoneText);
                    printDocument(undoStack);
                }
            } else if (command.equals("Redo")) {
                if (!redoStack.isEmpty()) {
                    String redoneText = redoStack.pop();
                    undoStack.push(redoneText);
                    printDocument(undoStack);
                }
            }
        }

        scanner.close();
    }

    private static void printDocument(Stack<String> stack) {
        StringBuilder document = new StringBuilder();
        for (String text : stack) {
            document.append(text);
        }
        System.out.println(document.toString());
    }
}
