package ChuanZhiLearning.day15;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Please enter a string: ");
            String inString = input.nextLine();
            if (inString.equals("end")) {
                flag = false;
            } else {
                System.out.println(change(inString));
                System.out.println("总共" + countABC(inString) + "个字母");
            }
        }
    }


    private static int countABC(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sum++;
            }
        }
        return sum;
    }

    private static String change(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a'){
                sb.append((char) (s.charAt(i) - 32));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                sb.append((char) (s.charAt(i) + 32));
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }
}
