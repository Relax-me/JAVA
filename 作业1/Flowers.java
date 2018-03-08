package 作业1;

public class Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=100;i<1000;i++)
		{
			if(judg(i)){
				System.out.println(i+"是水仙花数");
				sum++;
			}
		}
		System.out.println("总共有"+sum+"个水仙花数");
	}
	public static boolean judg(int n) {
		int a,b,c;
		a=n/100;
		b=(n%100)/10;
		c=n%10;
		if(a*a*a+b*b*b+c*c*c==n)
			return true;
		else return false;
	}
}
