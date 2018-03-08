package SystemIn;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bs=new byte[20];
		try {
			System.in.read(bs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < bs.length; i++) {
			System.out.print((char)bs[i]);
		}
	}

}
