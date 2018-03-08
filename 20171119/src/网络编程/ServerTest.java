package ÍøÂç±à³Ì;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket=new ServerSocket(8888);
			InputStream i=serverSocket.accept().getInputStream();
			byte[] b = new byte[30];
			i.read(b);
			for (int j = 0; j < b.length; j++) {
				System.out.print((char)b[j]);
			}
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
