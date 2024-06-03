import java.util.Scanner;

public class Ex17Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        for (int i = n; i >= 1; i--) {
            int num = i * 10;
            if (i == n) {
                System.out.print("L" + num  + " ");
            } else if (i % 2 == 0) {
                System.out.print("O" + num + " ");
            } else if (i % 2 != 0) {
                System.out.print("A" + num + " ");
            }


            for (int j = 2; j <= m; j++) {
                num += 1;
                if (i == n) {
                    System.out.print("L" + num + " ");
                } else if (i % 2 == 0) {
                    System.out.print("O" + num + " ");
                } else if (i % 2 != 0) {
                    System.out.print("A" + num + " ");
                }

            }
            System.out.println();
        }
    }
}
