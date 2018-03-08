package 作业2;

public class Test1  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Address address1=new Address("宋琳浩", "13689105606", "451220279@qq.com");
//				address1.Show();
//		Address address2=new Address("陈宇豪", "13892006850", "573052852@qq.com");
//				address2.Show();
//		Address address3=new Address("汪强", "18392623639", "292821746@qq.com");
//				address3.Show();
			short a=1;
			a+=1;
			byte b = 0;
			
			switch((int)b)
			
			{}
			System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//				Father sample = new Son();//向上转型   
//			 	System.out.println("调用的成员变量："+sample.name); 
//			 	sample.method();
	}

}
class Father {
	protected String name = "父亲属性";
	public void method() {   
		System.out.println("父类方法，对象类型：" + this.getClass()+"父类方法使用的变量"+name);
	}
}

class Son extends Father {
	protected String name = "儿子属性";
	public void method() {
		System.out.println("子类方法，对象类型：" + this.getClass()+"子类方法使用的变量"+name);

	}
}
