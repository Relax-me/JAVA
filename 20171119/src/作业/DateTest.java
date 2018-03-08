package 作业;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(a());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public static Date a()throws ParseException {
			Scanner scanner=new Scanner(System.in);
			String date=scanner.next();
			scanner.close();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			try {
				Date date1 = sdf.parse(date);
				return date1;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				throw new ParseException("输入日期格式错误", 0);
			}
	}

}

