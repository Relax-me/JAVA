package 作业2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入一个数：");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		System.out.print(num+"=1");
		fenjie(num);
	}
	public static void fenjie(int num) {
		if(judge(num))
		{
			System.out.print("*"+num);
			return;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
			{
				fenjie(i);
				fenjie(num/i);
				return;
			}
		}
	}
	public static boolean judge(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
