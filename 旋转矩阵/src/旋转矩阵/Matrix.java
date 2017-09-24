package 旋转矩阵;

import java.util.Scanner;

public class Matrix {
	public static int[][] matrix=new int[100][100];
	public static void main(String[] args) 
	{
		System.out.println("请输入您想要多少阶的矩阵");
		int n=0;
		Scanner s = new Scanner(System.in);
		if(s.hasNext()){
			n=s.nextInt();
		}
		xunhuan(n);
		show(n);
	}
	public static void show(int n)
{
		int i,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(matrix[i][j]+"\t");
		}
		System.out.print("\n\n\n");
	}
}
	public static int yiquan(int x,int y,int n,int now)
{
	for(int i=0;i<n;i++)
	{
		matrix[x+i][y]=now+i;
	}
	now=now+n-1;
	for(int i=0;i<n;i++)
	{
		matrix[x+n-1][y+i]=now+i;
	}
	now=now+n-1;
	for(int i=0;i<n;i++)
	{
		matrix[x+n-1-i][y+n-1]=now+i;
	}
	now=now+n-1;
	for(int i=0;i<n-1;i++)
	{
		matrix[x][y+n-1-i]=now+i;
	}
	now=now+n-1;
	return now;
}
	public static void xunhuan(int n)
{
	int now=1;
	int num=n;
	for(int i=0;i<n;i++)
	{
		now=yiquan(i,i,num,now);
		num=num-2;
	}

}
}
