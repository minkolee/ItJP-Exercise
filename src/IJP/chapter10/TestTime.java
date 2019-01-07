package ijp.chapter10;

public class TestTime {

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println(time1);
        System.out.println(time2);
    }

}

class Time {
    private long hour;
    private long minute;
    private long second;

    Time() {
        long nowMill = System.currentTimeMillis();
        hour = nowMill / 1000 / 3600;
        minute = nowMill / 1000 / 60 % 60;
        second = nowMill / 1000 % 60;
    }

    Time(long milliseconds) {
        hour = milliseconds / 1000 % 3600;
        minute = milliseconds / 1000 / 60 % 60;
        second = milliseconds / 1000 % 60;
    }

    Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    void setTime(long elapsedTime) {
        hour = elapsedTime / 1000 % 3600;
        minute = elapsedTime / 1000 / 60 % 60;
        second = elapsedTime / 1000 % 60;
    }

    public String toString() {
        return "Time is " + hour + " hours " + minute + " minutes " + second + " seconds.";
    }

}

