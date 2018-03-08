package Try;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest{
	public static void main(String[] args) {
		File file1=new File("e:\\01.bmp");
		byte[] bs=new byte[(int)file1.length()];
		try {
			FileInputStream iStream=new FileInputStream(file1);
			iStream.read(bs);
			iStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file2=new File("e:\\02.bmp");
		try {
			file2.createNewFile();
			FileOutputStream ostream=new FileOutputStream(file2);
			ostream.write(bs);
			ostream.close();	
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
