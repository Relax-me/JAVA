package 作业4;
//有一个Car类，该类用ComputeWeight接口类型的数组作为成员，
//那么该数组的元素就可以存放Television、Computer或WashMachine对象的引用。
//程序能输出Car对象所装载的货物的总重量

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
		System.out.println("车上物品总重为"+weight+"Kg");
	}
}
