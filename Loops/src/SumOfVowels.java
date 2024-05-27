import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        int sumOfLetters = 0;

        for(int i = 0; i <= word.length() - 1; i++) {

            String here = String.valueOf(word.charAt(i));

            if(here.equals("e")) {
                //System.out.println("yes");
                int pointE = 2;
                sumOfLetters += 2;
            } else if (here.equals("o")){
                //System.out.println("yes");
                int pointO = 4;
                sumOfLetters += 4;
            } else if (here.equals("a")){
                //System.out.println("yes");
                int pointA = 1;
                sumOfLetters += 1;
            } else if (here.equals("i")){
                //System.out.println("yes");
                int pointI= 3;
                sumOfLetters += 3;
            } else if (here.equals("u")){
                //System.out.println("yes");
                int pointU= 5;
                sumOfLetters += 5;
            }

        }
            System.out.println(sumOfLetters);
    }
}
