package Testclass;

//https://github.com/Relax-me/JAVA
public class Student {
	public String name;//姓名
	public int age;//年龄
	public String education;//学历
	
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
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
	}
	
}
