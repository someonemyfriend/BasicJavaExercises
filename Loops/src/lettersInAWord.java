import java.util.Scanner;

public class lettersInAWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordBig = scan.nextLine();

        for (int i = 0; i <= wordBig.length() - 1; i++){
            System.out.println(wordBig.charAt(i));
        }
    }

}
