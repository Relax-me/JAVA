package ��ҵ2;

public class Lorry extends Car{
	private double load;
	public Lorry(byte number, double weight,double load) {
		super(number, weight);
		// TODO Auto-generated constructor stub
		this.load=load;
	}
	public double getLoad() {
		return load;
	}
	public void setLoad(double load) {
		this.load = load;
	}
	public void Show(){
		System.out.println("���ָ�����"+getNumber()+"���أ�"+getWeight()+"��������"+load);
	}

}
