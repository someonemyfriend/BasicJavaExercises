//Write a program that reads the following data sequentially on separate lines:
// Text
// Symbol
// Integer
// Real number
//For each data type, create a separate variable and read from the console by a command
//corresponding to the specific type – String, char, int, double.

import java.util.Scanner;

public class ReadDifferentData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char symbol = scan.nextLine().charAt(0);
        int num = Integer.parseInt(scan.nextLine());
        double realNumber = Double.parseDouble(scan.nextLine());
        System.out.print(text + ", " + symbol + ", " + num + ", " + realNumber);
    }
}

//    Write a program that uses the data from task 5 and prints:
//        1. Each variable on a new line, in the order in which they are read.
//        2. All variables on one line (each in a separate command).
