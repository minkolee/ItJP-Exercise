package ChuanZhiLearning.day16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSDF {
    public static void main(String[] args) {

        Date date = new Date();

        /**
         *  1 创建SDF对象,参数是一个字符串,就是格式字符串
         *  2 调用 format(Date date)就可以
         */




        // parse 解析字符串为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date3 = sdf.parse("2019-01-14");
            System.out.println(date3);
        } catch(Exception e){

        }


    }
}
