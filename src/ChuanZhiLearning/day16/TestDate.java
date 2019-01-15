package ChuanZhiLearning.day16;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        // 当前操作系统的时间和日期,如果系统不准,它也不准
        Date date = new Date();
        System.out.println(date);
        Date date2 = new Date(Long.MAX_VALUE);
        long time = date.getTime();
        System.out.println(date2.getTime());
        date2.setTime(0);
        System.out.println(date2);
        SimpleDateFormat sdf = new SimpleDateFormat();
    }
}
