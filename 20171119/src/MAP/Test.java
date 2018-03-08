package MAP;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> treeMap=new TreeMap<Integer, Integer>();
		Scanner scanner=new Scanner(System.in);
		int num;
		num=scanner.nextInt();
		while(num!=-1) {
			if(treeMap.get(num)==null) {
				treeMap.put(num, 1);
			}else {
				treeMap.put(num, treeMap.get(num)+1);
			}
			num=scanner.nextInt();
		}
		scanner.close();
		Set<Entry<Integer, Integer>> zset=treeMap.entrySet();
		for(Iterator<Entry<Integer, Integer>> z=zset.iterator();z.hasNext();) {
			System.out.println(z.next().getKey()+"的次数为"+z.next().getValue());
		}
	}
}
