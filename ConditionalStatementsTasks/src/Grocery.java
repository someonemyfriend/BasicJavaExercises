//A chain of stores opens groceries in several cities and sells at different prices according to
//the city:

//Write a program that accepts a product (string), city (string) and quantity (decimal
//number) and calculates and prints how much the corresponding quantity of the selected
//product costs in the specified city.

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        if (product.equals("tea")) {
            if (city.equals("Sofia")) {
                double price = 0.50;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Plovdiv")) {
                double price = 0.40;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Varna")) {
                double price = 0.45;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            }
        } else if (product.equals("water")) {
            if (city.equals("Sofia")) {
                double price = 0.80;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Plovdiv")) {
                double price = 0.70;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Varna")) {
                double price = 0.70;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            }
        } else if (product.equals("juice")) {
            if (city.equals("Sofia")) {
                double price = 1.20;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Plovdiv")) {
                double price = 1.15;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Varna")) {
                double price = 1.10;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            }
        } else if (product.equals("sweets")) {
            if (city.equals("Sofia")) {
                double price = 1.45;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Plovdiv")) {
                double price = 1.30;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Varna")) {
                double price = 1.35;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            }
        } else if (product.equals("chips")) {
            if (city.equals("Sofia")) {
                double price = 1.60;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Plovdiv")) {
                double price = 1.50;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            } else if(city.equals("Varna")) {
                double price = 1.55;
                double sum = quantity * price;
                System.out.printf("%.2f",sum);
            }
        }
    }
}
