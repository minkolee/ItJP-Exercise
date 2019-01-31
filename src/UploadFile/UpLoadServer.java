package UploadFile;

import jdk.internal.util.xml.impl.Input;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器读入传输来的文件,然后将文件内容写入到一个文件中.
 * 由于TCP无法控制传输的内容,如果想将文件名一起传输
 * 需要分开多个长度控制,然后进行解析
 *
 * 互相等待的原因是因read在阻塞,没有数据读就一直等待,一定要给一个结束
 */

public class UpLoadServer {

    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        int len;
        FileOutputStream file = new FileOutputStream("D:\\new.jpg");
        ServerSocket server = new ServerSocket(8888);

        Socket client = server.accept();

        InputStream input = client.getInputStream();

        // 这里会阻塞
        while ((len = input.read(buffer)) != -1) {
            file.write(buffer, 0, len);
        }

        OutputStream out = client.getOutputStream();


        file.close();
        client.close();
        server.close();
    }



}
