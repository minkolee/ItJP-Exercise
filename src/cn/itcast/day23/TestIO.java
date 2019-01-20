package cn.itcast.day23;

/**
 * FileInputStream 和 FileOutputStream用于读写字节,便于按照字节操作二进制文件
 * 如果要读写字符比如中文字符的文本文件(不仅仅是txt,还有HTML或者代码文件,这个时候就必须使用FileRead类
 */


import java.io.*;
import java.util.Arrays;

public class TestIO {

    public static void main(String[] args) throws IOException {
        function();
    }

    private static void func2() throws IOException {
        File file = new File("d:\\1.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bb = new byte[5];
        System.out.println(Arrays.toString(bb));
        System.out.println(fis.read(bb));
        System.out.println(Arrays.toString(bb));
    }

    private static void function() throws IOException {
        // 这就是字节流的方法,用一个数组缓冲区,一次性读出一定长度的内容
        File source = new File("D:\\Downloads\\P020181223327049284458.doc");
        File dest = new File("d:\\2.doc");
        FileInputStream file = new FileInputStream(source);
        FileOutputStream file2 = new FileOutputStream(dest);
        byte[] bb = new byte[1024];
        int len;
        while ((len = file.read(bb)) != -1) {

            file2.write(bb, 0, len);
        }
        file2.close();


    }
}
