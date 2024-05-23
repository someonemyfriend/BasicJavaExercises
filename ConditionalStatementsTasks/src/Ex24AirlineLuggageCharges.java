//Write a console program that calculates luggage charges based on weight and dimensions:
    // If weight &gt; 50kg: $100 overweight fee.
    // If the sum of all dimensions (length + width + height) &gt; 158cm:
        //o If the sum exceeds by 1-20cm: $50 oversize fee.
        //o If the sum exceeds by 21-50cm: $100 oversize fee.
        //o If the sum exceeds by more than 50cm: $200 oversize fee.
    // If both overweight and oversize: additional $50 handling fee.


import java.util.Scanner;

public class Ex24AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = Integer.parseInt(scan.nextLine());
        int dimensions = Integer.parseInt(scan.nextLine());


        if(dimensions >= 158 ) {
            int sumOfDimensions = dimensions - 158;
//            System.out.println("sumOfDimensions " + sumOfDimensions);
            if(sumOfDimensions >= 1 && sumOfDimensions <= 20) {
                int priceForDimensions = 50;
                if(weight >= 50) {
                    priceForDimensions += 100 + 50;
                    System.out.println("$" + priceForDimensions + " (Overweight + Slightly oversize)");
                } else if(weight <= 49) {
//                    priceForDimensions += 100;
                    System.out.println("$" + priceForDimensions + " (Oversize)");
                }

            } else if (sumOfDimensions >= 21 && sumOfDimensions <= 50) {
                int priceForDimensions = 100;
                if(weight >= 50) {
                    priceForDimensions += 100 + 50;
                    System.out.println("$" + priceForDimensions + " (Overweight + Oversize + Handling)");
                } else if(weight <= 49) {
//                    priceForDimensions += 100;
                    System.out.println("$" + priceForDimensions + " (Oversize)");
                }

            } else if (sumOfDimensions >= 51) {
                int priceForDimensions = 200;
                if(weight >= 50) {
                    priceForDimensions += 100 + 50;
                    System.out.println("$" + priceForDimensions + " (Overweight + Oversize)");
                } else if(weight <= 49) {
//                    priceForDimensions += 100;
                    System.out.println("$" + priceForDimensions + " (Oversize)");
                }

            }
        } else if(dimensions <= 157) {
            System.out.println("none");
        }

    }
}
