package corejava.chapter3;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 3.6.6里那个字符 ,实际上在java里由于是UTF-16,需要用两个转义来表示
 * 这样可以看到, 表示 code unit 的length()是2,但是实际上是一个字符,所以用codePointCount得到的是1,所以真实长度应该是1,不应该简单使用.length()
 * 但是UTF-8与UTF-16如何转换,估计在网络的部分会学到
 * 遍历字符串中的每一个字符,是不能够简单使用charAt的,而要先判断当前码点是不是扩展部分,然后再使用codePointAt(i),根据判断结果将i+1还是+2来继续找下一个字符
 */

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
//        String test = "\uD835\uDD46";
//        System.out.println(test.length());
//        System.out.println(test.codePointCount(0,test.length()));
//        System.out.println(test.charAt(0)); //针对这个字符,由于都落在原始区未分配空间,所以无法打印
//        System.out.println(test.charAt(1));
//        System.out.println(test.codePointAt(0)); //打印出的是一个int,即Unicode 编码
//        System.out.println(test.codePointAt(1));

        PrintWriter out = new PrintWriter("learnJava.txt");
        out.write("fdsfsdakjkfdskjf");
        out.write("fdsfsdakjkfdskjfdsffsdkjfkjs");
        out.write("fdsfsdfdsffsdkjfkjs");

    }


}

