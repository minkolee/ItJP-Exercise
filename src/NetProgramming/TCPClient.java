package NetProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP的核心一样是IO流,发送就是写入,读取就是输入
 * 在服务端,也需要获取同样的套接字对象,执行发送和读取
 * TCP 的客户端对象是 java.net.socket
 * IO流都是字节流,必须发送字节流,因为网络实际上传输的也是二进制信号
 * 这里有一个问题没解决,就是循环读入的时候,如何才能知道读光了
 * 否则两个服务器会卡在那里
 * 可见需要一个什么标志来确定读光了
 */


public class TCPClient {

    public static void main(String[] args) throws IOException {
        // 这里是一个循环的TCP连接
        Socket socket = new Socket("127.0.0.1", 8888);
        Scanner input = new Scanner(System.in);
        OutputStream sender = socket.getOutputStream();
        sender.write(input.nextLine().getBytes());

        InputStream receiver = socket.getInputStream();
        byte[] content = new byte[1024];
        int len= receiver.read(content);
        System.out.println(new String(content, 0, len));

        socket.close();

    }

}
