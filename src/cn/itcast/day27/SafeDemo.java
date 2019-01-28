package cn.itcast.day27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SafeDemo {


    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        TicketSyncMethon t = new TicketSyncMethon();
        es.submit(t);
        es.submit(t);
        es.submit(t);
    }

}

