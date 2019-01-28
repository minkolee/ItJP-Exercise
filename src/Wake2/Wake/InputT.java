package Wake2.Wake;

import java.util.concurrent.locks.Lock;

public class InputT implements Runnable {
    private Resource resource;
    private int i = 0;

    InputT(Resource resource) {
        this.resource = resource;
    }


    public void run() {
        while (true) {
            synchronized (resource) {
                if (resource.flag) {
                    try {
                        resource.wait();
                    } catch (InterruptedException ex) {
                        System.out.println("没有成功等待");
                    }
                } else {
                    if (i % 2 == 0) {
                        resource.name = "张三";
                        resource.sex = "男";
                    } else {
                        resource.name = "Lisi";
                        resource.sex = "Nv";
                    }
                    i++;
                    resource.notify();
                    try {
                        resource.wait();
                    } catch (InterruptedException ex) {
                    }

                }
            }
        }
    }
}
