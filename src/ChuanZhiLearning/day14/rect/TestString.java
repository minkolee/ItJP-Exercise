package ChuanZhiLearning.day14.rect;

import sun.text.normalizer.UTF16;

import java.util.Arrays;

public class TestString {


    public static void main(String[] args) {
        String a = "普通的字符串";

        System.out.println(Arrays.toString(a.toCharArray()));

        StringBuffer stb = new StringBuffer("ABC");
        System.out.println(stb);
        stb.append(6);
    }
}
