package Testclass;

//https://github.com/Relax-me/JAVA
public class Student {
	public String name;//����
	public int age;//����
	public String education;//ѧ��
	
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Student(String name, int age, String education) {
		super();
		this.name = name;
		this.age = age;
		this.education = education;
	}
	void Show(){
		System.out.println("������"+name+"\n���䣺"+age+"\nѧ����"+education);
	}
	
}
