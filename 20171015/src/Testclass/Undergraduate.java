package Testclass;
//https://github.com/Relax-me/JAVA
public class Undergraduate extends Student{
	public Undergraduate(String name1, byte age1, String eduaction1,String specialty1) {
		super(name1, age1, eduaction1);
		// TODO Auto-generated constructor stub
		specialty=specialty1;
	}
	private String specialty;
	void Show(){
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
		System.out.println("רҵ��"+specialty);
	}
}
