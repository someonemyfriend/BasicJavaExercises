public class MultiplicationTable {
    public static void main(String[] args) {
        int firstMultiplier = 1;
        int secondMultiplier = 1;
        int result = 0;

        for (int i = firstMultiplier; i <= 10; i++) {
           // System.out.printf("h" + i);
            for (int j = secondMultiplier; j<=10; j++){
                int mul = i * j;
                System.out.println(i + ":" + j + " = " + mul);
//                for (int z = result; z<=10; z++){
//                    result = firstMultiplier * secondMultiplier;
//                    System.out.println( firstMultiplier + "*" + secondMultiplier + "=" + result);
//                }
            }

        }
    }
}
