package ChuanZhiLearning.day15;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Please enter a string: ");
            String inString = input.nextLine();
            if (inString.equals("end")) {
                flag = false;
            } else {
                Object[] result = deleteSubString(inString, "g");
                System.out.println(Arrays.toString(result));
            }
        }
    }

    //取替换后的结果就是获取子串索引,然后分拆成两个字符串即可
    private static Object[] deleteSubString(String s1, String s2) {
        int count = 0;
        while (s1.contains(s2)) {
            s1 = s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length());
            count++;
        }
        return new Object[]{s1, count};
    }
}
