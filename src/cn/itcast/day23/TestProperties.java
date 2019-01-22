package cn.itcast.day23;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) throws Exception {
        fun1();
    }


    public static void fun1() throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\test.properties",true);
        BufferedOutputStream out = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");

//        写入部分,测试完成
//        Properties pp = new Properties();
//        pp.setProperty("Jenny", "黄梦婕");
//        pp.setProperty("Cony", "李悠然");
//        pp.setProperty("Minko", "明猪");
//        pp.setProperty("Rookie", "猩猩");
//        pp.store(osw,"#咕咕");
//        System.out.println(pp);

        osw.close();
        FileInputStream fis = new FileInputStream("D:\\test.properties");
        BufferedInputStream bis = new BufferedInputStream(fis);
        InputStreamReader isr = new InputStreamReader(bis,StandardCharsets.UTF_8);

        Properties result = new Properties();
        result.load(isr);

        System.out.println(result);
    }
}
