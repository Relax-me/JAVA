package 作业2;

public class Microbus extends Car {
	private byte passengers;
	public Microbus(byte number, double weight,byte passengers) {
		super(number, weight);
		// TODO Auto-generated constructor stub
		this.passengers=passengers;
	}
	public byte getPassengers() {
		return passengers;
	}
	public void setPassengers(byte passengers) {
		this.passengers = passengers;
	}
	public void Show(){
		System.out.println("车轮个数："+getNumber()+"车重："+getWeight()+"载客数："+passengers);
	}

}
