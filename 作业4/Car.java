package ��ҵ4;
//��һ��Car�࣬������ComputeWeight�ӿ����͵�������Ϊ��Ա��
//��ô�������Ԫ�ؾͿ��Դ��Television��Computer��WashMachine��������á�
//���������Car������װ�صĻ����������

public class Car {
	private ComputeWeight[] things;
	private double weight=0;
	public Car(ComputeWeight...things) {
		this.things=things;
	}
	public void Show() {
		for (int i = 0; i < things.length; i++) {
			weight+=things[i].computeWeight();
		}
		System.out.println("������Ʒ����Ϊ"+weight+"Kg");
	}
}
