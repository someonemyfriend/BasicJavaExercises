//Write a console program that assumes age (real number) and gender (&#39;m&#39; or &#39;f&#39;), and
//prints a reference among the following:


import java.util.Scanner;

public class Ex09AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        String gender = scan.nextLine();


        if( gender.equals("f") ) {
            if ( age <= 16 ) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if( age <= 16 ) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }


    }
}
