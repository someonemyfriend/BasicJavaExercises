//Write a program that calculates the profit from the order in a makeup shop.
//Makeup prices:
//• powder - 2.60 lv.
//• lipstick - 3 lv.
//• spiral - 4.10 lv.
//• shadows - 8.20 lv.
//• concealer - 2 lv.
//If the ordered makeup count is 50 or more, the store makes a discount of 25% of the
//total price. Of the money earned, the shop must give 10% off the rent of the store. Find
//out if the money will be enough to do the renovation of the shop, needed to stay in
//business.
//Input
//You get 6 parameters:
//• Price of the renovation - a real number in the range [1.00 ... 10000.00]
//• count of powders - integer in the range [0... 1000]
//• count of lipsticks - an integer in the range [0 ... 1000]
//• count of spirals - an integer in the range [0 ... 1000]
//• count of shadows - an integer in the range [0 ... 1000]
//• count of correctors - integer in the range [0 ... 1000]
//Output
//Print on the Console:
//• If the money is enough, print:
//o &quot;Yes! {remaining money} lv left.&quot;
//• If the money is NOT enough, print:
//o &quot;Not enough money! {the lack of money} lv needed.&quot;
//
//The result must be formatted to two decimal places.


import java.util.Scanner;

public class Ex15MakeupShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceRenovation = Double.parseDouble(scan.nextLine());
        double powders = Double.parseDouble(scan.nextLine());
        double lipsticks = Double.parseDouble(scan.nextLine());
        double spirals = Double.parseDouble(scan.nextLine());
        double shadows = Double.parseDouble(scan.nextLine());
        double correctors = Double.parseDouble(scan.nextLine());

        double pricePowders = 2.60;
        double priceLipsticks = 3;
        double priceSpirals = 4.10;
        double priceShadows = 8.20;
        double priceCorrectors = 2;


        double amount =
                powders * pricePowders +
                lipsticks * priceLipsticks +
                spirals * priceSpirals +
                shadows * priceShadows +
                correctors * priceCorrectors;

        double countOfMakeUp = powders + lipsticks + spirals + shadows + correctors;
        System.out.println("amount " + amount);
        System.out.println("countOfMakeUp " + countOfMakeUp);

        if ( countOfMakeUp >= 50 ) {
            //discount 25%
            //25% of 680 = 170 BGN discount
            double discount = (amount * 25) / 100;
            double endPrice = amount - discount;
            double rent = (endPrice * 10) / 100;
            double profit = endPrice - rent;

            double moneyLeft = profit - priceRenovation;

            if (profit > priceRenovation ) {

                System.out.println("Yes! " +  moneyLeft + " lv left.");
            } else {
                System.out.println("Not enough money! " +  moneyLeft + " lv needed.");
            }

        } else if ( countOfMakeUp < 50 ) {
            double rent = (amount * 10) / 100;
            System.out.println("rent " + rent);
            double profit = amount - rent;

            if (profit < priceRenovation ) {
                double checkMoney = priceRenovation - profit;
                System.out.printf("Not enough money! %.2f lv needed.", checkMoney);
            } else {

                double checkMoney = priceRenovation - profit;
                checkMoney *= -1;
                System.out.printf("Yes! %.2f lv left.", checkMoney);
            }
        }

    }
}
