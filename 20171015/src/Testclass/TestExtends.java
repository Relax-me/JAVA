package Testclass;
//https://github.com/Relax-me/JAVA
public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Sutdent��Ķ���");
		Student stu1=new Student("���պ�", (byte)17, "����");
		stu1.Show();
		System.out.println("����Undergraduate��Ķ���");
		Undergraduate Und1=new Undergraduate("���պ�", (byte)20,"һ��", "�������");
		Und1.Show();
		System.out.println("����Graduate��Ķ���");
		Graduate Gra1=new Graduate("���պ�", (byte)23, "�о���", "�˹������㷨");
		Gra1.Show();
	}

}
