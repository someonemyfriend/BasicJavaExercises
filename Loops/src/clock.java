public class clock {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;

        for (int i = hours; i <= 23; i++) {
//            System.out.printf("h first line" + i);
                for (int j = minutes; j<=59; j++){
                    System.out.println( i + ":" + j);
                }

        }
    }
}
