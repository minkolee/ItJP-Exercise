package MTUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 多线程的客户端不用修改
 */


public class UpLoadClient {

    public static void main(String[] args) throws IOException {
        // 缓冲数组和字节流对象还有socket是一定要做的
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream out = socket.getOutputStream();
        FileInputStream file = new FileInputStream("D:\\test.jpg");

        int len;
        byte[] buffer = new byte[1024];
        while ((len = file.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        // 写入终止字符
        socket.shutdownOutput();


        InputStream input = socket.getInputStream();
        len = input.read(buffer);
        System.out.println(new String(buffer, 0, len));

        // 自建的本地流对象要关闭
        file.close();
        // 跟着套接字走的流不用关,关socket就行
        socket.close();
    }

}
