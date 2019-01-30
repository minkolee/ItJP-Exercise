package NetProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/**
 * 还是数据包和socket对象
 * 实现思路不一样,由于需要接收,必须一直在监听:
 * 1 先创建socket对象,要绑定一个端口了,不能直接发送了
 * 2 创建字节数组,不知道有多少
 * 3 创建数据包
 * 4 使用receive方法等待连接
 * 5 从数据包中拆出长度等数据,然后用String构造器还原数据
 */


public class UDPReceiver {

    public static void main(String[] args) throws IOException {

        // 端口号要和发送包里一致
        DatagramSocket socket = new DatagramSocket(8888);

        //创建一个字节数组准备接收发来的数据
        //单个最大长度是1024*64,是UDP一次信息的上限
        byte[] bytes = new byte[1024];

        // 创建接收数据包,就不需要地址和端口了,所以采用两个参数的构造器
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //receive方法的线程阻塞,在等待发送数据
        socket.receive(dp);

        //这里必须要拆包,可以拆出IP地址,发送方端口,字节数组的长度,才能够将数

        //直接打印,发现是一串全部的东西
        System.out.println(new String(bytes));

        //拆包,拆长度出来,之后可以采用复制数组的办法
        int length = dp.getLength();
        //使用String构造器只构造指定的数组长度,就可以拿到信息了
        System.out.println(new String(bytes,0,length));

        //获取IP
        String ip = dp.getAddress().getHostAddress();
        System.out.print(ip);

        //获取端口
        int port = dp.getPort();
        System.out.println(":"+port);

        socket.close();
    }
}
