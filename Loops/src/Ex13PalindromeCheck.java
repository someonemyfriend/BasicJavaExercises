import java.util.Scanner;

public class Ex13PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String theWord = sc.nextLine();
        String reverseStr = "";

        int theWordLength = theWord.length();

        for (int i = (theWordLength - 1); i>=0; --i ) {
            reverseStr = reverseStr + theWord.charAt(i);

        }

        if (theWord.equals(reverseStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        System.out.println(theWord);
//        System.out.println(reverseStr);
    }
}
