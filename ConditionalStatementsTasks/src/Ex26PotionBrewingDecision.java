import java.util.Scanner;

public class Ex26PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();

        if(first.equals("herbs")) {
            if(second.equals("water")) {
                System.out.println("Health potion");
            } else if(second.equals("oil")) {
                System.out.println("Stealth potion");
            } else {
                System.out.println("Minor stamina potion");
            }
        } else if(first.equals("berries")) {
            if(second.equals("sugar")) {
                System.out.println("Speed potion");
            } else {
                System.out.println("Minor energy potion");
            }
        } else {
            System.out.println("No potion");
        }

    }
}
