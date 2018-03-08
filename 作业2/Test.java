package 作业2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0到1000内的完数有：");
		for(int i=1;i<=1000000;i++) {
			if(judge(i))
			System.out.print(i+" ");
		}
	}
	public static boolean judge(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
			{
				sum+=i;
			}
			if(sum>num)
			{
				return false;
			}
		}
		if(sum==num)
			return true;
		else return false;
	}

}
