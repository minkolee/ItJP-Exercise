package ijp.chapter3;


import java.util.Scanner;

public class E26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        boolean and65 = i % 6 == 0 && i % 5 == 0;
        boolean or65 = i%6==0 || i%6==0;
        boolean xor65 = i % 5 == 0 ^ i % 6 == 0;

        System.out.println("Is "+i+" divisible by 5 and 6? "+ and65);
        System.out.println("Is "+i+" divisible by 5 or 6? "+ or65);
        System.out.println("Is "+i+" divisible by 5 or 6, but not both? "+ xor65);
    }
}

