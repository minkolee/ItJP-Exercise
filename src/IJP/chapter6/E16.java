package ijp.chapter6;

/**
 * 又是改例题,略过
 */

public class E16 {
    public static int numberOfDaysInAYear(int year) {
        int i = 365;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            i = 366;
        }
        return i;
    }

    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
        }
    }
}
