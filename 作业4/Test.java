package ��ҵ4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car(new Television()).Show();
		new Car(new Television(),new Computer(),new WashMachine()).Show();
		new Car(new Computer(),new Computer()).Show();
		Graduate zhangsan=new Graduate("����",'��',20,6000,5500);
		System.out.println((zhangsan.getPay()-zhangsan.getFee())<2000?"proviae a loan":"proviae nothing");
	}

}
