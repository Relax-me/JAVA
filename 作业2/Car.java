package 作业2;
//7、	设计一个汽车类，属性有车轮个数和车重。
//卡车类是汽车类的子类，新增加的属性有载重量。
//面包类是卡车类的子类，新增加的属性有载客数。
//每个类都有相关数据的输出。
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
		System.out.println("车轮个数："+number+"车重："+weight);
	}
}
