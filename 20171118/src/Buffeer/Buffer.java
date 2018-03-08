package Buffeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf=null;
		bf=new BufferedReader(new InputStreamReader(System.in));
		String string=null;
		try {
			while(!(string=bf.readLine()).equals("exit"))
			{
				System.out.println(string);
				string=null;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
