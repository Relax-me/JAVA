package Testclass;
import java.util.Scanner;
public class Test2 {
	public static int[] num=new int[50];
	public static int[] times=new int[50];
	public static void In(int n){
		for(int i=0;i<50;i++)
		{
			if(n==num[i])
			{
				times[i]++;
				break;
			}
			else if(times[i]==0){
				num[i]=n;
				times[i]++;
				break;
			}
		}
	}	
	public static void Show(){
		for(int i=0;i<50;i++)
		{
			if(times[i]==0)
				break;
			else System.out.println("������"+num[i]+"  ������"+times[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner s = new Scanner(System.in);
		System.out.println("������0~50����Χ�ڵĶ������,����-1����");
		n=s.nextInt();
		while(n!=-1){
			In(n);
			n=s.nextInt();
		}
		Show();
		s.close();
	}

}
