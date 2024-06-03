import java.util.Scanner;

public class Ex15CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

//        if(num % 2 == 0) {
//            num = num / 2;
//        } else if (num % 2 != 0) {
//
//        }
        System.out.print(num + " ");
        while(num >= 2) {
            if(num % 2 == 0) {
                num = num / 2;
                System.out.print(num + " ");
            } else if (num % 2 != 0) {
                num = (num * 3) + 1;
                System.out.print(num + " ");
            }
        }
    }
}
