package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection1=new ArrayList<String>();
		//����һ�����϶���		
		collection1.add("000");
		//��Ӷ���Collection������	
		collection1.add("111");
		collection1.add("222");
		System.out.println("����collection1�Ĵ�С:"+collection1.size());
		System.out.println("����collection1������:"+collection1);
		//�Ӽ���collection1���Ƴ��� ��000�� �������	
		collection1.remove("000");
		System.out.println("����collection1�Ƴ� 000 �������:"+collection1);
		System.out.println("����collection1���Ƿ����000:"+collection1.contains("000"));
		System.out.println("����collection1���Ƿ����111:"+collection1.contains("111"));
		Collection<String> collection2=new ArrayList<String>();
		//��collection1 �����е�Ԫ��ȫ�����ӵ�collection2��"
		collection2.addAll(collection1);
		System.out.println("����collection2������:"+collection2);
		collection2.clear();
		//��ռ��� collection1 �е�Ԫ��"
		System.out.println("����collection2�Ƿ�Ϊ��:"+collection2.isEmpty());
		//������collection1ת��Ϊ����	
		//////////////////////////////////////////
		String [] strings = new String[collection1.size()];
		collection1.toArray(strings);
		for(int i=0;i<strings.length;i++){
			System.out.println(strings[i]);
		}
	}

}
