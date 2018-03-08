package Propeties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Properties pro = new Properties();
		Set<Object> set;
		pro.put("name","кнау╨ф");
		set=pro.keySet();
		Iterator<Object> itr = set.iterator();
		String str;
		while(itr.hasNext()) {
			str= (String) itr.next();
	         System.out.println("The capital of " +
	                 str + " is " + pro.getProperty(str) + ".");
	      }
		str = pro.getProperty("Florida", "Not Found");
	      System.out.println("The capital of Florida is "
	          + str + ".");
		try {
			FileOutputStream out = new FileOutputStream("a.properties");
			pro.save(out, "test");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
