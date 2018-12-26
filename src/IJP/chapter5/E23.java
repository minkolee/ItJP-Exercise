package ijp.chapter5;

/**
 * 普通数学问题,略过
 */


public class E23 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 50000; i >= 1; i--) {
            sum1 = sum1 + 1.0 / i;
        }

        System.out.println("From right to left is " + sum1);

        for (int j = 1; j <= 50000; j++) {
            sum2 = 1.0 / j + sum2;
        }
        System.out.println("From left to right is " + sum2);

    }
}
