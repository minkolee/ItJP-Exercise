package ijp.chapter9;

import java.util.Date;

public class testDate {
    public static void main(String[] args) {
        for (long i = 10000L; i <= 100000000000L; i *= 10L) {
            Date date = new Date(i);
            System.out.println(date.toString());
        }
    }
}
