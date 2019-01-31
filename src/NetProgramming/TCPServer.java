package NetProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        // 启动服务器Socket
        ServerSocket server = new ServerSocket(8888);

        // 获取客户端的链接
        Socket client = server.accept();

        InputStream input = client.getInputStream();

//        // UTF_8转码写入文本
//        FileOutputStream fos = new FileOutputStream("D:\\utf.txt",true);
//        BufferedOutputStream out = new BufferedOutputStream(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);

        byte[] content = new byte[1024];
        int len=input.read(content);
            System.out.println(new String(content, 0, len));

        // 获取客户端输入



        // 用字节数组接受,然后循环读入,直到读光,然后将每一个东西写入文件

//        input.close();
//
//        osw.close();

        OutputStream output = client.getOutputStream();

        output.write("成功写入文件".getBytes());


        client.close();
        server.close();

    }
}
