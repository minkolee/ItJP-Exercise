package ijp.chapter5;

import java.util.Scanner;


public class E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        String message = input.nextLine();
        String[] arrs = message.split(" ");
        int sum = 0;
        int pcount = 0;
        int ncount = 0;

        if (Integer.parseInt(arrs[0]) == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            for (int i = 0; i < arrs.length; i++) {
                if (Integer.parseInt(arrs[0]) == 0) {
                    break;
                } else {
                    if (Integer.parseInt(arrs[i]) == 0) {
                        break;
                    } else if (Integer.parseInt(arrs[i]) > 0) {
                        pcount++;
                    } else {
                        ncount++;
                    }
                    sum += Integer.parseInt(arrs[i]);
                }

            }
            double avg = (double) sum / (pcount + ncount);
            System.out.println("The number of positives is " + pcount);
            System.out.println("The number of negatives is " + ncount);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + avg);
        }

    }
}
