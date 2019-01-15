package ijp.chapter3;

import java.util.Scanner;

/**
 *
 */

public class E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2):");
        int result = input.nextInt();
        int computer = (int) (Math.random() * 3);
        System.out.print("The computer is ");
        if (computer == 0 && result == 0) {
            System.out.print("scissor. You are scissor too. It is a draw");
        } else if (computer == 0 && result == 1) {
            System.out.print("scissor. You are rock. You won");
        } else if (computer == 0 && result == 2) {
            System.out.print("scissor. You are paper. You lose");
        } else if (computer == 1 && result == 0) {
            System.out.print("rock. You are scissor. You lose");
        } else if (computer == 1 && result == 1) {
            System.out.print("rock. You are rock too. It is a draw");
        } else if (computer == 1 && result == 2) {
            System.out.print("scissor. You are paper. You lose");
        } else if (computer == 2 && result == 0) {
            System.out.print("paper. You are scissor. You win");
        } else if (computer == 2 && result == 1) {
            System.out.print("paper. You are rock. You lose");
        } else {
            System.out.print("paper. You are paper too. It is a draw");
        }

    }
}

