//Write a program that checks whether the received number is in the range [-100, 100]
//and is different from 0 and outputs &quot;Yes&quot; if it meets the conditions, or &quot;No&quot; if it is outside
//them.

import java.util.Scanner;

public class Ex11NumberInTheRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        if(num == 0) {
            System.out.println("No");

        } else if (num >= -100 && num <= 100 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
