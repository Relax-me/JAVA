package 作业3;

import java.util.Scanner;
public class Text {

	public static int[] num = new int[50];
	public static int[] times = new int[10];

	public static void In(int n) {
		times[(n-1)/10]++;
	}
public static void Show() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i*10+"~"+(i*10+10)+":");
			for(int j=0;j<times[i];j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			
		}
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1~100个范围内的多个整数,输入-1结束");
		n = scanner.nextInt();
		while (n != -1) {
			In(n);
			n = scanner.nextInt();
		}
		scanner.close();
		Show();
	}

}
