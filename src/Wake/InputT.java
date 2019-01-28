package Wake;

import java.util.concurrent.locks.Lock;

public class InputT implements Runnable {
    private Resource resource;
    private int i = 0;
    private Lock lock;

    InputT(Resource resource, Lock lock) {
        this.lock = lock;
        this.resource = resource;
    }


    public void run() {
        while (true) {
            lock.lock();
            if (i % 2 == 0) {
                resource.name = "张三";
                resource.sex = "男";
            }else{
                resource.name = "Lisi";
                resource.sex = "Nv";
            }

            i++;
            lock.unlock();
        }
    }



}
