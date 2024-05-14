import java.util.Scanner;

public class InchesToSm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double santimetres = Double.parseDouble(scanner.nextLine());
        double inches = santimetres * 2.54;
        System.out.println( inches );

    }
}