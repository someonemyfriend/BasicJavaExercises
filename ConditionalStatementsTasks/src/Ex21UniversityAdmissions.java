import java.util.Scanner;

public class Ex21UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = Integer.parseInt(scan.nextLine());
        int extracurriculars = Integer.parseInt(scan.nextLine());

        if (score >= 90) {
            System.out.println("Admitted");
        } else if (score >= 80 && score <= 89 ) {
            if(extracurriculars >= 2) {
                System.out.println("Admitted");
            } else {
                System.out.println("Not admitted");
            }
        } else if(score < 80){
            System.out.println("Not admitted");
        }
    }
}
