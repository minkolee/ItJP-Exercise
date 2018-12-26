package ijp.chapter5;

/**
 * 普通数学问题,略过
 */


public class E24 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 97; i = i + 2) {
            sum = sum + (double) i / (i + 2);
        }
        System.out.println("The result is " + sum);
    }
}
