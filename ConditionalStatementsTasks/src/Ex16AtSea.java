import java.util.Scanner;

public class Ex16AtSea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String assessment = scan.nextLine();
        double totalPrice = 0.0;

        switch (room) {
            case "single room":

                totalPrice = (days -1) * 25.00;
                if (days < 10) {
//                    totalPrice = totalPrice - totalPrice * 30 / 100;
                    //System.out.println(totalPrice);
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                } else if (days <= 15) {
//                    totalPrice = totalPrice - totalPrice * 35 / 100;
                    //System.out.println("here " + totalPrice);

                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }

                } else if (days > 15) {
//                    totalPrice = totalPrice - totalPrice * 50 / 100;
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                }
                break;
            case "apartment":

                totalPrice = (days -1) * 50.00;
                if (days < 10) {
                    totalPrice = totalPrice - totalPrice * 30 / 100;
                    //System.out.println(totalPrice);
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                } else if (days <= 15) {
                    totalPrice = totalPrice - totalPrice * 35 / 100;
                    //System.out.println("here " + totalPrice);

                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }

                } else if (days > 15) {
                    totalPrice = totalPrice - totalPrice * 50 / 100;
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                }
                break;
            case "presidential":

                totalPrice = (days -1) * 100.00;
                if (days < 10) {
                    totalPrice = totalPrice - totalPrice * 10 / 100;
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                } else if (days <= 15) {
                    totalPrice = totalPrice - totalPrice * 15 / 100;
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                } else if (days > 15) {
                    totalPrice = totalPrice - totalPrice * 20 / 100;
                    if (assessment.equals("positive")) {
                        double raitingDiscount = (totalPrice * 25) /100;
                        double raitingPositive = totalPrice + raitingDiscount;
                        System.out.printf("%.2f", raitingPositive);
                    } else {
                        double raitingDiscount = (totalPrice * 10) /100;
                        double raitingNegative = totalPrice - raitingDiscount;
                        System.out.printf("%.2f", raitingNegative);
                    }
                }
                break;
        }


        //System.out.printf("%.2f", price);
    }

}
