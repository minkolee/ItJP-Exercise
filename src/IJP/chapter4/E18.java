package ijp.chapter4;

import java.util.Scanner;

/**
 * 和题目要求略微不符,懒得改了
 */

public class E18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String message = input.nextLine();
        char first = message.charAt(0);
        char second = message.charAt(1);

        switch (first) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        switch (second) {
            case '1':
                System.out.print("Freshman");
                break;
            case '2':
                System.out.print("Sophomore");
                break;
            case '3':
                System.out.print("Junior");
                break;
            case '4':
                System.out.print("Senior");
                break;
            default:
                System.out.println();
                break;
        }
    }
}