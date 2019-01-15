package ijp.chapter3;

import java.util.Scanner;


public class E11 {
    public static void main(String[] args) {

        System.out.print("Enter month and year: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        int days;
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (leap && month == 2) {
            days = 29;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 2) {
            days = 28;
        } else {
            days = 30;
        }
        System.out.println(month + " of " + year + " has " + days + " days.");

    }
}

