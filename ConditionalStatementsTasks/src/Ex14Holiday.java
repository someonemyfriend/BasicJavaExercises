//A young programmer has a certain budget and free time in a given season. Write a
//program that accepts the budget and the season and calculates where the programmer
//will go on vacation and how much he will spend from his budget.
//The budget determines the destination, and the season determines how much of the
//budget he will spend. If it&#39;s summer, he&#39;ll be camping, in winter he is going to a hotel.
//If he is in Asia, regardless of the season he will rest in a hotel. Each campsite or hotel,
//according to the destination, has its own price which corresponds to a given percentage of
//the budget:
// At 100lv. or less – somewhere in Bulgaria
//o Summer – 30% of the budget
//o Winter – 70% of the budget
// At 1000lv. Somewhere in Europe, somewhere in Europe.
//o Summer – 40% of the budget
//o Winter – 80% of the budget
// With more than 1000lv. Somewhere in Asia
//o On vacation in Asia, regardless of the season will spend 90% of the budget.
//
//Input:
//The function takes 2 parameters:
//• First parameter – Budget, real number in the range [10.00...5000.00].
//• Second parameter – One of two possible seasons: &quot;summer&quot; or &quot;winter&quot;
//Output:
//Two lines must be printed on the console.
//• First line – &quot;Somewhere in [destination]&quot; among &quot;Bulgaria&quot;, &quot;Europe&quot; and &quot;Asia&quot;
//• Second line – &quot;{Type of holiday} – {Amount spent}&quot;
//The holiday can be on &quot;Camp&quot; or &quot;Hotel&quot;. The sum must be rounded to the nearest
//second character after the comma.


import java.util.Scanner;

public class Ex14Holiday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        if (budget <= 100) {
            if (season.equals("summer")) {
                double spend = (budget * 30) / 100;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", spend );
            } else if (season.equals("winter")) {
                double spend = (budget * 70) / 100;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", spend );
            }

        } else if (budget >= 101 && budget <= 1000) {
            if (season.equals("summer")) {
                double spend = (budget * 40) / 100;
                System.out.println("Somewhere in Europe");
                System.out.printf("Camp - %.2f", spend );
            } else if (season.equals("winter")) {
                double spend = (budget * 80) / 100;
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", spend );
            }
        } else if (budget > 1000) {
            double spend = (budget * 90) / 100;
            System.out.println("Somewhere in Asia");
            System.out.printf("Hotel - %.2f", spend );
        }


    }
}
