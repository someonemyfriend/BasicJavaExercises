import java.util.Scanner;
public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfArhitect = scan.nextLine();
        // String lastName = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());

        int hoursOfWork = projects * 3;


        System.out.printf("The architect " + nameOfArhitect + " will need " + hoursOfWork  + " hours to complete " + projects + " project/s.");
    }
}
