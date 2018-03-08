package Date;

import java.sql.Date;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date(0);
		System.out.println(date);
		long time=date.getTime();
		Date date2=new Date(time);
		System.out.println(date2);
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
	}

}
