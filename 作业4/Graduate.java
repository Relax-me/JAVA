package ื๗าต4;

public class Graduate implements StudentsManageInterface, TeacherManageInterface {
	private String name;
	private char sex;
	private int age;
	public Graduate(String name, char sex, int age, int pay, int fee) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.pay = pay;
		this.fee = fee;
	}

	private int pay;
	private int fee;
	@Override
	public void setPay(int pay) {
		// TODO Auto-generated method stub
		this.pay=pay;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}

	@Override
	public void setFee(int fee) {
		// TODO Auto-generated method stub
		this.fee=fee;
	}

	@Override
	public int getFee() {
		// TODO Auto-generated method stub
		return fee;
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

}
