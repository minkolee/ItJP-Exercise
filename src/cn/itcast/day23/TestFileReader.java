package cn.itcast.day23;

/**
 * 读UTF-8 无BOW的文件,可以直接读取,File的Read读一个就是一个字符,而不是一个字节
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {


    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("d:\\1.txt");
//        FileWriter fw = new FileWriter("d:\\3.txt");
//        fw.write("测试一下编码是否正确");
//        fw.close();
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            System.out.println(ch);
            System.out.println((char) ch);
        }

    }
}
