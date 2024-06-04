

    import java.util.Scanner;

    public class Ex19Padawan {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Reading inputs
            double moneyAvailable = scanner.nextDouble();
            int students = scanner.nextInt();
            double priceLightsaber = scanner.nextDouble();
            double priceRobe = scanner.nextDouble();
            double priceBelt = scanner.nextDouble();

            // Calculate the number of lightsabers needed (10% more, rounded up)
            int lightsabersNeeded = (int) Math.ceil(students * 1.1);

            // Calculate the total cost for lightsabers, robes, and belts
            double totalCostLightsabers = lightsabersNeeded * priceLightsaber;
            double totalCostRobes = students * priceRobe;

            // Calculate the number of free belts
            int freeBelts = students / 6;
            double totalCostBelts = (students - freeBelts) * priceBelt;

            // Calculate the total equipment cost
            double totalCost = totalCostLightsabers + totalCostRobes + totalCostBelts;

            // Print the result
            if (totalCost <= moneyAvailable) {
                System.out.printf("The money is enough - it would cost %.2flv.%n", totalCost);
            } else {
                double neededMoney = totalCost - moneyAvailable;
                System.out.printf("George Lucas will need %.2flv more.%n", neededMoney);
            }

            scanner.close();
        }
    }


