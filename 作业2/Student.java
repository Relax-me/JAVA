package ��ҵ2;
//1��	����һ��ѧ����Student��ѧ������Ϣ����ѧ�š����������䡢�ɼ���ѧУ����״̬��Ϣ
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
