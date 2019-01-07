package corejava.chapter03;

import java.time.LocalDate;

public class TestLocalDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);


        date = date.minusDays(date.getDayOfMonth() - 1);

        System.out.println(date);
        System.out.println(date.getDayOfWeek().getValue());
    }
}
