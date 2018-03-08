package Testclass;
//https://github.com/Relax-me/JAVA
public class Graduate extends Student{
	public Graduate(String name1, byte age1, String eduaction1,String direction1) {
		super(name1, age1, eduaction1);
		// TODO Auto-generated constructor stubs
		direction=direction1;
	}
	private String direction;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("研究方向："+direction);
	}
}
