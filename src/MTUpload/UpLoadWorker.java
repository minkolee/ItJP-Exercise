package MTUpload;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class UpLoadWorker implements Runnable {

    private Socket socket;

    public UpLoadWorker(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int len;
            Random rand = new Random();
            String name = System.currentTimeMillis() + "" + rand.nextInt(999999);
            FileOutputStream file = new FileOutputStream("D:" + File.separator + name + ".jpg");
            InputStream input = socket.getInputStream();

            // 这里会阻塞
            while ((len = input.read(buffer)) != -1) {
                file.write(buffer, 0, len);
            }

            OutputStream out = socket.getOutputStream();

            out.write("上传成功".getBytes());

            file.close();
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("上传失败");

        }
    }
}
