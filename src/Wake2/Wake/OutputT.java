package Wake2.Wake;


public class OutputT implements Runnable {

    private Resource resource;

    OutputT(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            synchronized (resource) {
                if(!resource.flag)
                System.out.println(resource.name + "..." + resource.sex);
                //唤醒输入的进程,然后自己等待
                try {
                    resource.notify();
                    resource.wait();
                } catch (InterruptedException ex) {
                    System.out.println("等待出现异常");
                }
            }

        }
    }
}
