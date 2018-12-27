package ijp.chapter5;

/**
 * 提供了阶乘的新思路,用前一项除以后一项
 */


public class E26 {
    public static void main(String[] args) {
        double e = 1;
        double start = 1.0 / 1;
        for (int i = 10000; i <= 100000; i += 10000) {
            for (int j = 2; j <= i; j++) {
                e+=start;
                start = start / j;
            }
            System.out.println("E is " + e);
        }
    }
}
