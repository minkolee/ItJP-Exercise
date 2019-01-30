package NetProgramming;

/**
 * 网络编程 java.net包中
 *
 *
 * InetAddress 静态方法
 * 可以从主机名获得ip
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {


    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            InetAddress remote = InetAddress.getByName("www.conyli.cc");
            System.out.println("本机的IP地址：" + local.getHostAddress());
            System.out.println("itcast的IP地址：" + remote.getHostAddress());
            System.out.println("itcast的主机名为：" + remote.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        // IP地址类还有很多方法
    }
}
