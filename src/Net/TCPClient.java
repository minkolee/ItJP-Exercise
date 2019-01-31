package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream out = socket.getOutputStream();
		out.write(input.nextLine().getBytes());
		
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data, 0, len));
		
		socket.close();
	}
}
