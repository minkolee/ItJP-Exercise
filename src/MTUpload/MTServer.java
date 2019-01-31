package MTUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端每个用户一个线程,将上传方法封装到Run方法里
 */

public class MTServer {

    public static void main(String[] args) throws IOException {
        // 为每个用户搞一个线程
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            // 阻塞
            Socket client = server.accept();
            // 每次能够获取一个,就把client扔到一个新线程去然后启动run方法
             new Thread(new UpLoadWorker(client)).start();
        }
        //永不停歇之后就无需关闭server
    }



}
