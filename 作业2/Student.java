package 作业2;
//1、	定义一个学生类Student，学生的信息包括学号、姓名、年龄、成绩和学校名等状态信息
public class Student {
	private int id;
	private String name;
	private byte age;
	private byte score;
	private String school;
	public Student()
	{
		super();
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public byte getScore() {
		return score;
	}
	public void setScore(byte score) {
		this.score = score;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}
