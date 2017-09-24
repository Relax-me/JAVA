package 乘2判断;

import java.util.Scanner;

public class C2 {
	public static void main(String[] args)
	{
		System.out.println("请输入您想要多少阶的矩阵");
		int n=0;
		Scanner s = new Scanner(System.in);
		if(s.hasNext())
		{
			n=s.nextInt();
		}
		C(n,1);
		
	}
	public static void C(int n,int flag)
	{
		if(flag>0)
		{
			if(n<=5000)
			{
				System.out.println(n);
				n=n*2;
				flag++;
				C(n,flag);
			}
			else
			{
				System.out.println(n);
				flag=-flag;
				C(n,flag);
			}
		}
		else
		{
			if(flag==-1)
			{
				System.out.println(n);
				return ;
			}
			else 
			{
				System.out.println(n);
				n=n/2;
				flag++;
				C(n,flag);
			}
		}
	}
}
