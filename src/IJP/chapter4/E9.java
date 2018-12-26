package ijp.chapter4;

import java.util.Scanner;

/**
 * 本体忽略，又是算数学
 * */

public class E9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String message = input.nextLine();
        char first = message.charAt(0);
        int cc = (int) first;
        System.out.println("The Unicode for the character E is " + cc);
    }
}
