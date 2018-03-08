package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection1=new ArrayList<String>();
		//创建一个集合对象		
		collection1.add("000");
		//添加对象到Collection集合中	
		collection1.add("111");
		collection1.add("222");
		System.out.println("集合collection1的大小:"+collection1.size());
		System.out.println("集合collection1的内容:"+collection1);
		//从集合collection1中移除掉 “000” 这个对象	
		collection1.remove("000");
		System.out.println("集合collection1移除 000 后的内容:"+collection1);
		System.out.println("集合collection1中是否包含000:"+collection1.contains("000"));
		System.out.println("集合collection1中是否包含111:"+collection1.contains("111"));
		Collection<String> collection2=new ArrayList<String>();
		//将collection1 集合中的元素全部都加到collection2中"
		collection2.addAll(collection1);
		System.out.println("集合collection2的内容:"+collection2);
		collection2.clear();
		//清空集合 collection1 中的元素"
		System.out.println("集合collection2是否为空:"+collection2.isEmpty());
		//将集合collection1转化为数组	
		//////////////////////////////////////////
		String [] strings = new String[collection1.size()];
		collection1.toArray(strings);
		for(int i=0;i<strings.length;i++){
			System.out.println(strings[i]);
		}
	}

}
