package ijp.chapter4;

import java.util.Scanner;

/**
 *
 * */

public class E11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        short i = input.nextShort();
        char cc;
        cc = ' ';
        switch (i){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                cc = (char) (48 + i);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                cc = (char) (65 + i - 10);
                break;
            default:
                System.out.println("Out of range");
                break;
        }
        System.out.println("The hex value is "+ cc);
    }
}
