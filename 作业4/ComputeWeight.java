package 作业4;
//卡车要装载一批货物，货物有3种商品：电视、计算机和洗衣机。
//需要计算出大货车和小货车各自所装载的3中货物的总重量。
//编写一个Java应用程序，要求有一个ComputeWeight接口
//该接口中有一个方法：public double computeWeight(); 
//有3个实现该接口的类：Television、Computer和WashMachine。
//这3个类通过实现接口ComputeWeight给出自重。
public interface ComputeWeight {
	public abstract double computeWeight();
}
