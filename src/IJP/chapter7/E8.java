package ijp.chapter7;

/**
 * 1 重载的核心是两个函数函数签名不同,就是不同的函数,而不是函数名相同
 */
public class E8 {
    public static void main(String[] args) {
        double[] darry = {10.1, 2.3, 4.5, 5.69, 3.45, 9.30, 8.30, 6.58, 9.37, 5.43};
        int[] iarry = {1, 2, 4, 5, 3, 9, 8, 6, 9, 5};
        System.out.println(" " + average(darry));
        System.out.println(" " + average(iarry));
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
