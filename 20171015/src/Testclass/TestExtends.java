package Testclass;
//https://github.com/Relax-me/JAVA
public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("创建Sutdent类的对象");
		Student stu1=new Student("宋琳浩", (byte)17, "高中");
		stu1.Show();
		System.out.println("创建Undergraduate类的对象");
		Undergraduate Und1=new Undergraduate("宋琳浩", (byte)20,"一本", "软件工程");
		Und1.Show();
		System.out.println("创建Graduate类的对象");
		Graduate Gra1=new Graduate("宋琳浩", (byte)23, "研究生", "人工智能算法");
		Gra1.Show();
	}

}
