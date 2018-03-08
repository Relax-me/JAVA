package Try;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			daoshu();
//		}catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("num现在为:999");
//		}
		daoshu();
		
	}
	public static void daoshu()throws ArithmeticException {
		int num;
//		int a;
//		int[] b=new int [3];
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数字num，以求它的倒数");
		num=scanner.nextInt();
		System.out.println("num的倒数为:"+(100/num)/100.0);
		scanner.close();
		throw new ArithmeticException();		
	}
//		System.out.println("请输入一个数字a，给数组内的a项赋值为1");
//		a=scanner.nextInt();
//		scanner.close();
//		try {
//			for(int i=0;i<a;i++) {
//				b[i]=1;
//			}
//			System.out.print("数组里面是:");
//			for(int i=0;i<a;i++) {
//				System.out.print(b[i]+" ");
//			}
//		}catch (ArrayIndexOutOfBoundsException e) {
//			b=new int[a];
//			e.printStackTrace();
//			for(int i=0;i<a;i++) {
//				b[i]=1;
//			}
//			System.out.print("原数组只有3项，处理后数组b里面是:");
//			for(int i=0;i<a;i++) {
//				System.out.print(b[i]+" ");
//			}			
//		}
//	}
}
