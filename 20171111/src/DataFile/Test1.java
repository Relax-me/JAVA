package DataFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				DataOutputStream out = new DataOutputStream(new FileOutputStream("123.txt"));
				Double[] doubles= {1.0,2.0,3.0};
				int[] ints= {1,2,3};
				String[] strings= {"11","22","33"};
				for (int i = 0; i < 3; i++) {
					out.writeDouble(doubles[i]);
					out.writeChar('\t');
					out.writeInt(ints[i]);
					out.writeChar('\t');
					out.writeUTF(strings[i]);
				}
				out.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//////////////////////////////////////
			
			try {
				DataInputStream in = new DataInputStream(new FileInputStream("123.txt"));
				double[] doubles= new double[3];
				int[] ints= new int[3];
				String[] strings=new String[3];
				for (int i = 0; i < 3; i++) {
					doubles[i]=in.readDouble();
					in.readChar();
					ints[i]=in.readInt();
					in.readChar();
					strings[i]=in.readUTF();
					System.out.println(doubles[i]+" "+ints[i]+" "+strings[i]+"\n");
				}
				in.close();				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
	}

}
