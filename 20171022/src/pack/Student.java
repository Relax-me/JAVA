package pack;

public class Student{
	public int id;
	protected String nameString;
	char sex;
	private int score;
	public Student(int id, String nameString, char sex, int score) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.sex = sex;
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", sex=" + sex + ", score=" + score + "]";
	}

}
class Stu extends Student {
	public static void main(String[] args) {
		Stu stu=new Stu();
		stu.id=1;
		stu.nameString="кнау╨ф";
		stu.sex='дп';
		//stu.score=100;
	}

}
