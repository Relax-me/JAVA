package Testclass;

public class Student {
	protected String name;//姓名
	protected byte age;//年龄
	protected String education;//学历
	public Student(String name1,byte i,String eduaction1) {
		// TODO Auto-generated constructor stub
		name=name1;
		age=i;
		education = eduaction1;
	}
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
	}
}
