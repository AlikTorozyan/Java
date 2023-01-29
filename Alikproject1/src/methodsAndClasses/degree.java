package methodsAndClasses;

public class degree {

    public static void main(String[] args) {

        System.out.println(degreeOfNumbersToTen(3, 5));
    }

    public static long degreeOfNumbersToTen(int a, int b) {
        double sum = 1;
        long sum1 = 1;
        int sum2 = 1;
        int k1 = -1;
        int k2 = -2;
        if (a > 10) {
            System.out.println("'a' must be between 1-10");
        }
        if (b > 10 || b < (-10)) {
            System.out.println("'b' must be between -10 and 10");
        }
        if (a < 0) {
            System.out.println("'a' must not be negative");
        }
        if (a > 0 && (b < 0 && b >= (-10))) {
            sum = 1;
            for (int i = 1; i <= (-1 * b); i++) {
                sum = (double) (sum * 1 / a);
            }
            System.out.printf("%.10f\n", sum);
        }
        if ((a >= 0 && a <= 10) && (b > 0 && b <= 10)) {
            sum1 = 1;
            for (int i = 1; i <= b; i++) {
                sum1 = (long) (sum1 * a);
            }
            System.out.println(sum1);
        }
        if ((a > 0 && a <= 10) && b == 0) {
            System.out.println(sum2);
        }

        return sum1;

    }


}



