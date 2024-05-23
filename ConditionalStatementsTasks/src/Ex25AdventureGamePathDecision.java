import java.util.Scanner;

public class Ex25AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rightHand = scan.nextLine();
        String leftHand = scan.nextLine();

        if(rightHand.equals("sword")) {
            if(leftHand.equals("shield")) {
                System.out.println("Path to the castle");
            } else {
                System.out.println("Path to the forest");
            }

        } else if(rightHand.equals("map")) {
            if(leftHand.equals("coins")) {
                System.out.println("Go to the town");
            } else {
                System.out.println("Camp");
            }
        } else {
            System.out.println("Wander aimlessly");
        }

    }
}
