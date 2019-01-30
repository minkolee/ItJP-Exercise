package NetProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * UDP有两个类:
 * 一个是DatagramPacket 数据包包
 * 一个是DatagramSocket,即传输包用的socket对象,可以在发送端也可以在接收端
 * 实现一个UDP协议的发送端
 *
 */


public class UDPTest {

    public static void main(String[] args) {

        UPDSend("你好");

    }

    public static void UPDSend(String message) {
        // 发送的先封装数据,需要封装数据,接收的IP地址和端口
        DatagramSocket socket = null;
        byte[] bytes = message.getBytes();
        try {
            // 数据包的创建
            DatagramPacket ddd = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);

            // 数据传送socket的创建,调用.send()方法发送数据包
            socket = new DatagramSocket();
            socket.send(ddd);

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
            System.out.println("创建数据包失败");

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Socket发送失败");
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

}
