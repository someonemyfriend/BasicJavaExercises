//Write a program that receives speed (real number) and prints speed information.
//• At speeds up to 10 (inclusive) print "slow".
//• At speeds above 10 and up to 60 print "average".
//• At speeds above 60 and up to 120, print "fast".
//• At speeds above 120 and up to 160, print "super-fast".
//• At higher speeds, print "turbo-fast".

import java.util.Scanner;

public class Ex07Speed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speed = Integer.parseInt(scan.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 60) {
            System.out.println("average");
        } else if (speed <= 120) {
            System.out.println("fast");
        } else if (speed <= 160) {
            System.out.println("super-fast");
        } else { // no need for "speed >= 161" condition here
            System.out.println("turbo-fast");
        }
    }
}
