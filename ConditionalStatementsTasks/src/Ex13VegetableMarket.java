//The vegetable market works on working days at the following prices:

//Saturday and Sunday the stock exchange operates at higher prices:

//Write a program that accepts vegetable (tomato / onion / lettuce / cucumber /
//pepper), day of the week (Monday / Tuesday / Wednesday / Thursday / Friday /
//Saturday / Sunday) and quantity (real number) and calculates the price according to
//the prices in the tables above.
//• Print the result rounded by 2 decimal places.
//• In case of an invalid day of the week or invalid vegetable name, print &quot;error&quot;.


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Ex13VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vegetables = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.0;

        switch (vegetables) {
            case "tomato":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                    price = 2.50;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 2.80;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else {
                    System.out.print("error");
                }
                break;
            case "onion":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                    price = 1.20;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.30;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else {
                    System.out.print("error");
                }
                break;
            case "lettuce":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                    price = 0.85;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 0.85;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else {
                    System.out.print("error");
                }
                break;
            case "cucumber":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                    price = 1.45;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.75;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else {
                    System.out.print("error");
                }
                break;
            case "pepper":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                    price = 5.50;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 3.50;
                    double sum = quantity * price;
                    System.out.printf("%.2f", sum);
                } else {
                    System.out.print("error");
                }
                break;
            default:
                System.out.print("error");
        }

    }

}
