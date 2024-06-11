import java.util.Scanner;

public class TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int realMinutes = (minutes + 30);
        if(realMinutes >= 60) {
            hour++;
            realMinutes = realMinutes % 60;

        }
        if(hour == 24) {
            hour = 0;
        }
        System.out.printf("%s:%02d", hour, realMinutes);
    }
}
