package ijp.chapter9;

import java.awt.*;
import java.util.Date;

/**
 * Date.getTime()获取毫秒数
 */


public class testStopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int sum = -3000;
        int string = 65;
        for (int i = 0; i < 100000000; i++) {
            if (i % 2 == 0) {
                sum--;
                string += 6;
            }
            sum++;
            string -= 5;
        }
        watch.stop();
        System.out.println("Time is " + watch.getElapsedTime());
    }

}

class StopWatch {
    private Date startTime;
    private Date endTime;

    StopWatch() {
        startTime = new Date();
    }

    public void setStartTime(long n) {
        startTime = new Date(n);
    }

    public void setStartTime() {
        startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(long n) {
        endTime = new Date(n);
    }

    public void setEndTime() {
        endTime = new Date();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}