package ijp.chapter5;

import java.util.Scanner;

/**
 * 这道题目注意,不能直接nextInt,否则剩下的那个空格会被nextline读取走,于是使用了两次nextline用来读取数据
 */


public class E9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert numbers of students: ");

        int i = Integer.parseInt(input.nextLine());
        int j = 0;
        int max = 0;
        int second = 0;
        int temp;
        String[] message;
        String firstName = "";
        String secondName = "";
        String ms;
        String tempname;

        do {
            j++;
            System.out.print("Please insert student's name and score (John 64): ");
            ms = input.nextLine();
            message = ms.split(" ");
            if (Integer.parseInt(message[1]) >= max) {
                temp = max;
                tempname = firstName;
                max = Integer.parseInt(message[1]);
                firstName = message[0];
                if (temp >= second) {
                    second = temp;
                    secondName = tempname;
                }
            } else {
                if (Integer.parseInt(message[1]) > second) {
                    second = Integer.parseInt(message[1]);
                    secondName = message[0];
                }
            }
        } while (j < i);
        System.out.println("The student with the highest score is " + firstName + " " + max);
        System.out.println("The student with the second highest score is " + secondName + " " + second);
    }
}
