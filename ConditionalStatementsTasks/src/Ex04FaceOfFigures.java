//Write a function that takes the dimension of a geometric figure and calculates its face.
//The figures are of four types: square, rectangle, circle, and triangle.
// If the figure is a square, the next parameter is a number - the length of its side.
// If the figure is a rectangle, the next two parameters - the lengths of its sides.
// If the figure is a circle, the next parameter is a number - the radius of the circle.
// If the figure is a triangle, the next two parameters - the length of its side and the
//length of the height to it.
//Round the result to 2 decimal places.


import java.util.Arrays;
import java.util.Scanner;

public class Ex04FaceOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();
        double areaSide = Double.parseDouble(scan.nextLine());
//        double secondSide = Double.parseDouble(scan.nextLine());

        double area = 0;

        switch(figure) {
            case "square":
                area = areaSide * areaSide;
                System.out.printf("%.2f", area);
                break;
            case "rectangle":
                double secondSide = Double.parseDouble(scan.nextLine());
                area = areaSide * secondSide;
                System.out.printf("%.2f", area);
                break;
            case "triangle":
                secondSide = Double.parseDouble(scan.nextLine());
                area = (1.0/2) * areaSide * secondSide;
                System.out.printf("%.2f", area);
                break;
            case "circle":
                area = Math.PI * areaSide * areaSide;
                System.out.printf("%.2f", area);
                break;
        }



    }
}
