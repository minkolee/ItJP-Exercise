package ijp.chapter5;

/**
 * 普通数学问题,略过
 */


public class E25 {
    public static void main(String[] args) {
        double pi;
        for (int j = 10000; j <= 100000; j += 10000) {
            pi = 0;
            for (int i = 1; i <= j; i++) {
                pi = pi + (Math.pow(-1, i + 1)) / (2 * i - 1);
            }
            pi *= 4;
            System.out.println("When i = " + j + " the result is " + pi);
        }
    }
}
