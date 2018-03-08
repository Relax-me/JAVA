package IOtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest{
	public static void main(String[] args) {
		File file=new File("e:\\123.txt");
		try {
			FileOutputStream ostream=new FileOutputStream(file);
			String string="Hello World!";
			char[] s=string.toCharArray();
			byte[] bs=new byte[s.length];
			for(int i=0;i<s.length;i++)
				bs[i]=(byte)s[i];
			ostream.write(bs);
			ostream.close();	
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream iStream=new FileInputStream(file);
			byte[] bs=new byte[(int)file.length()];
			iStream.read(bs);
			//iStream.read(bs,0,4);
			iStream.close();	
			for(byte a:bs)
			System.out.print((char)a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
