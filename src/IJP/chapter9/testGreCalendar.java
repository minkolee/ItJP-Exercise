package ijp.chapter9;

import java.util.GregorianCalendar;

public class testGreCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR) + " month is " + calendar.get(GregorianCalendar.MONTH) + " day is " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR) + " month is " + calendar.get(GregorianCalendar.MONTH) + " day is " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
