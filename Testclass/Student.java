package Testclass;

public class Student {
	protected String name;//����
	protected byte age;//����
	protected String education;//ѧ��
	public Student(String name1,byte i,String eduaction1) {
		// TODO Auto-generated constructor stub
		name=name1;
		age=i;
		education = eduaction1;
	}
	void Show(){
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
	}
}
