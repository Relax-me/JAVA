package ��ҵ2;

public class Test1  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Address address1=new Address("���պ�", "13689105606", "451220279@qq.com");
//				address1.Show();
//		Address address2=new Address("�����", "13892006850", "573052852@qq.com");
//				address2.Show();
//		Address address3=new Address("��ǿ", "18392623639", "292821746@qq.com");
//				address3.Show();
			short a=1;
			a+=1;
			byte b = 0;
			
			switch((int)b)
			
			{}
			System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//				Father sample = new Son();//����ת��   
//			 	System.out.println("���õĳ�Ա������"+sample.name); 
//			 	sample.method();
	}

}
class Father {
	protected String name = "��������";
	public void method() {   
		System.out.println("���෽�����������ͣ�" + this.getClass()+"���෽��ʹ�õı���"+name);
	}
}

class Son extends Father {
	protected String name = "��������";
	public void method() {
		System.out.println("���෽�����������ͣ�" + this.getClass()+"���෽��ʹ�õı���"+name);

	}
}
