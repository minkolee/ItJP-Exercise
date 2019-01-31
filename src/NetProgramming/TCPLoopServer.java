package NetProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPLoopServer {

    public static void main(String[] args) throws IOException {
        // 启动服务器Socket
        ServerSocket server = new ServerSocket(8888);
        byte[] content = new byte[1024];
        int len;

        while (true) {
            Socket client = server.accept();
            InputStream input = client.getInputStream();
            while ((len = input.read(content)) != -1) {
                System.out.println(new String(content, 0, len));
            }
        }



    }
}
