package cn.itcast.day23;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) throws IOException {

        //创建字节流,用转换流包装,指定编码,准备写入
//        FileOutputStream fos = new FileOutputStream("D:\\count.txt", true);
//        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

//        String str = "If you want to change your fate I think you must come to the dark horse to learn java";
//        String[] strs = str.split(" ");
//        for (String e : strs) {
//            int len = e.length();
//            osw.write(e + '=' + len + "\r\n");
//        }

//        osw.write("三鹅");

//        osw.close();

//        FileInputStream fr = new FileInputStream("D:\\count.txt");
//        FileInputStream fis = new FileInputStream("D:\\count.txt");
//        InputStreamReader fr = new InputStreamReader(fis, "UTF-8");

//        int chr;
//        byte[] bb=new byte[30];
//        while ((chr = fr.read(bb)) != -1) {
//            System.out.println(chr);
//        }
//
//        System.out.println(Arrays.toString(bb));

//        System.out.println((char) fr.read());
//        System.out.println((char) fr.read());
//        System.out.println((char) fr.read());
        func();
    }

    private static void func() throws IOException {
        /**
         * 流的嵌套关系:
         * 底层都是字节操作,然后往上一层是缓冲读取和输出
         * 再往上一层是从字节按照编码转换成char类型,和从char类型转换成其他编码
         * 转换成char 类型,实际上就是转换成UTF-16
         */
        FileInputStream fis = new FileInputStream("D:\\gbk.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        InputStreamReader isr = new InputStreamReader(bis, "GBK");
        FileOutputStream fos = new FileOutputStream("D:\\utf.txt");
        BufferedOutputStream out = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
        int len;
        char[] cc = new char[1024];
        while ((len = isr.read(cc)) != -1) {
            osw.write(cc, 0, len);
            osw.flush();
        }
        osw.close();
    }
}
