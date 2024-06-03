import java.util.Scanner;

public class Ex14ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int remainder = 0;
        int result = 0;
        int originalNum = num;

        String NUMBER_TO_STRING = Integer.toString(num);
        int numOfDigits = NUMBER_TO_STRING.length();
       // System.out.println("The child is " + NUMBER_TO_STRING);
       // System.out.println(numOfDigits);

      if(numOfDigits == 4) {
          while (originalNum != 0) {
              remainder = originalNum % 10;
             // System.out.println("here is remainder " + remainder);
              result += Math.pow(remainder, 4);
              originalNum /= 10;
          }
          if (result == num) {
              System.out.println("true");
          } else {
              System.out.println("false");
          }
      } else if(numOfDigits == 3) {
          while (originalNum != 0)
          {
              remainder = originalNum % 10;
             // System.out.println("here is remainder " + remainder);
              result += Math.pow(remainder, 3);
              originalNum /= 10;
          }

          if(result == num) {
              System.out.println("true");
          } else {
              System.out.println("false");
          }
      }
    }
}
