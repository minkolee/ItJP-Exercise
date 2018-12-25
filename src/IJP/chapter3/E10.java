package ijp.chapter3;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;

            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer ”What is number1 – number2?”
        System.out.print
                ("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 +
                    " should be " + (number1 - number2));
        }


        int number21 = (int) (Math.random() * 100);
        int number22 = (int) (Math.random() * 100);

        if (number21 < number22) {
            int temp2 = number21;

            number21 = number22;
            number22 = temp2;
        }
        System.out.print
                ("What is " + number21 + " - " + number22 + "? ");
        Scanner input2 = new Scanner(System.in);
        int answer2 = input.nextInt();

        if (number21 - number22 == answer2)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number21 + " - " + number22 +
                    " should be " + (number21 - number22));
        }
    }
}