import java.util.Scanner;

public class Ex27SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String timeOfDay = scan.nextLine();
        String environment = scan.nextLine();
        String items = scan.nextLine();

        if(timeOfDay.equals("day")) {
            if(environment.equals("forest")) {
                if(items.equals("knife")) {
                    System.out.println("Hunt for food");
                } else if (items.equals("container")) {
                    System.out.println("Collect berries");
                } else {
                    System.out.println("Explore");
                }
            } else if(environment.equals("desert")) {
                if(items.equals("hat")) {
                    System.out.println("Search for water");
                } else {
                    System.out.println("Find shade");
                }
            }
        } else if(timeOfDay.equals("night")) {
            if(environment.equals("forest")) {
                if(items.equals("firestarter")) {
                    System.out.println("Make a campfire");
                } else {
                    System.out.println("Climb a tree");
                }
            } else if(environment.equals("desert")) {
                if(items.equals("blanket")) {
                    System.out.println("Sleep");
                } else {
                    System.out.println("Keep moving to stay warm");
                }
            }
        }

    }
}
