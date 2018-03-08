package ÍøÂç±à³Ì;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) {
		try {
			InetAddress address=InetAddress.getByName("asd");
			System.out.println(address);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
