package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add(0,"slh");
		list.add(0,"chy");
		list.add(2,"slh");
		System.out.println(list);
		System.out.println(list.indexOf("slh"));
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		///////////////////////////////////
		for (Iterator<String> iterator2 = list.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}

}
