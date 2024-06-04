

    import java.util.Scanner;

    public class Ex20RageExpenses {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Reading inputs
            int lostGamesCount = scanner.nextInt();
            double headsetPrice = scanner.nextDouble();
            double mousePrice = scanner.nextDouble();
            double keyboardPrice = scanner.nextDouble();
            double displayPrice = scanner.nextDouble();

            // Initialize counters
            int trashedHeadsets = 0;
            int trashedMice = 0;
            int trashedKeyboards = 0;
            int trashedDisplays = 0;

            // Calculate the number of trashed items
            for (int i = 1; i <= lostGamesCount; i++) {
                if (i % 2 == 0) {
                    trashedHeadsets++;
                }
                if (i % 3 == 0) {
                    trashedMice++;
                }
                if (i % 2 == 0 && i % 3 == 0) {
                    trashedKeyboards++;
                    if (trashedKeyboards % 2 == 0) {
                        trashedDisplays++;
                    }
                }
            }

            // Calculate the total expenses
            double totalExpenses = (trashedHeadsets * headsetPrice) +
                    (trashedMice * mousePrice) +
                    (trashedKeyboards * keyboardPrice) +
                    (trashedDisplays * displayPrice);

            // Print the result
            System.out.printf("Rage expenses: %.2f lv.%n", totalExpenses);

            scanner.close();
        }
    }


