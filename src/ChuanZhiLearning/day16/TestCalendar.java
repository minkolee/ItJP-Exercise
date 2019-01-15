package ChuanZhiLearning.day16;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args){
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置出生年月日 1995-05-10
        my.set(Calendar.YEAR, 1983);
        my.set(Calendar.MONTH, 6);
        my.set(Calendar.DATE, 9);
        //获取时间中的天数
        long mydate = my.getTimeInMillis();
        long today = c.getTimeInMillis();
        long delta = today - mydate;
        System.out.println(delta/86400000);

    }

}
