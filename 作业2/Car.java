package ��ҵ2;
//7��	���һ�������࣬�����г��ָ����ͳ��ء�
//������������������࣬�����ӵ���������������
//������ǿ���������࣬�����ӵ��������ؿ�����
//ÿ���඼��������ݵ������
public class Car {
	private byte number;
	private double weight;
	public Car(byte number, double weight) {
		super();
		this.number = number;
		this.weight = weight;
	}
	public byte getNumber() {
		return number;
	}
	public void setNumber(byte number) {
		this.number = number;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void Show(){
		System.out.println("���ָ�����"+number+"���أ�"+weight);
	}
}
