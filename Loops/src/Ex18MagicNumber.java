import java.util.Scanner;

public class Ex18MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        boolean found = false;
        int combinationCount = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            //System.out.println(i);
            for (int j = firstNumber; j <= secondNumber; j++) {
                combinationCount++;
               // System.out.println(j);
                if(i +j == thirdNumber) {
                    System.out.println("Combination " + combinationCount + " - (" + i + " + " + j + " = " + thirdNumber + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println(combinationCount + " combinations - neither equals " + thirdNumber);
        }

    }
}
