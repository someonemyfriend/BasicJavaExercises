//Write a function that receives an integer and prints on the console, whether even or odd.

//TODO:
// 1.How can be break this code?
// 2. if we type "-1"
// 3. if we type string
// 4. long number
// 4. symbol

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());


        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }


}
