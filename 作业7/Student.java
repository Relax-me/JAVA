package 作业7;

public class Student{
	private int snum;
	private String name;
	private char sex;
	private int age;
	private int score;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "学生[学号："+snum+" 姓名："+name+" 性别："+sex+" 年龄："+age+" 成绩："+score+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + sex;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (snum ^ (snum >>> 32));
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (sex != other.sex)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (snum != other.snum)
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	public Student(int snum, String name, char sex, int age, int score) {
		super();
		this.snum = snum;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
