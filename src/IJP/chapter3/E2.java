package ijp.chapter3;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random());
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        int number3 = (int) (System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int number = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " + " + number3 + " = " + number + " is " +
                        (number1 + number2 + number3 == number));
    }
}
