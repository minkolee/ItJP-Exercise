package Wake;

import java.util.concurrent.locks.Lock;

public class OutputT implements Runnable {

    private Resource resource;
    private Lock lock;

    OutputT(Resource resource, Lock lock) {
        this.resource = resource;
        this.lock = lock;
    }

    public void run() {
        while (true) {
            lock.lock();
            System.out.println(resource.name + "..." + resource.sex);
            lock.unlock();
        }
    }
}
