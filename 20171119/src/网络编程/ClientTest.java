package ÍøÂç±à³Ì;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("»òÔ¾ÔÚÔ¨i",8888);
			OutputStream o= s.getOutputStream();
			o.write("I'm SongLinhao".getBytes());
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
