package ijp.chapter3;

import java.util.Scanner;

/**
 * 代码基本相同,不再赘述
 */

public class E15 {
    public static void main(String[] args) {

        System.out.print("Enter your guess, 0 for head and 1 for tail: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = (int)(Math.random()*2);
        if(result==number){
            System.out.println("You are right");
        } else {
            System.out.println("You are wrong");
        }
    }
}

