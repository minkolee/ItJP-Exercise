package ijp.chapter5;

/**
 * 闰年问题写成一个方法
 */


public class E27 {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 101; j <= 2100; j++) {
            if (isLeapYear(j)) {
                System.out.print(j + " ");
                count++;
            }
            if ((count) % 10 == 0 && count != 0) {
                System.out.println();
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
