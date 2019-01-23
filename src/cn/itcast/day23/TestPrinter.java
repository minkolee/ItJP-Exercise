package cn.itcast.day23;

import java.io.*;

public class TestPrinter {

    public static void main(String[] args) throws Exception {
        write();
    }

    public static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\utf.txt");
        BufferedOutputStream out = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(out, "GBK");

        // 前边也是可以通过一个包装后的流来写,转换流通吃
        PrintWriter pw = new PrintWriter(osw);
        pw.write("三鹅");
        pw.close();
    }
}
