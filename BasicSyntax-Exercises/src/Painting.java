//For the painting of 3 rooms they spent n kg of paint (equally for each room). To get the
//        desired color, they mixed yellow, red and white paint. The yellow paint was 4 times more
//        than the red and 2 times less than the white. How many kilograms of each color did they
//        spend on painting a room?
//        From the console read n -&gt; total paint consumed.
//        The output must be rounded to the fourth decimal point.

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float paint = Integer.parseInt(scan.nextLine());
        float onePart = paint / 13;
        float yellow = onePart * 4;
        float white = yellow * 2;

        System.out.println(String.format("Red: %.4f", onePart));
        System.out.println(String.format("Yellow: %.4f", yellow));
        System.out.println(String.format("White: %.4f", white));
    }
}
