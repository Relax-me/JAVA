package Try;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			daoshu();
//		}catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("num����Ϊ:999");
//		}
		daoshu();
		
	}
	public static void daoshu()throws ArithmeticException {
		int num;
//		int a;
//		int[] b=new int [3];
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ������num���������ĵ���");
		num=scanner.nextInt();
		System.out.println("num�ĵ���Ϊ:"+(100/num)/100.0);
		scanner.close();
		throw new ArithmeticException();		
	}
//		System.out.println("������һ������a���������ڵ�a�ֵΪ1");
//		a=scanner.nextInt();
//		scanner.close();
//		try {
//			for(int i=0;i<a;i++) {
//				b[i]=1;
//			}
//			System.out.print("����������:");
//			for(int i=0;i<a;i++) {
//				System.out.print(b[i]+" ");
//			}
//		}catch (ArrayIndexOutOfBoundsException e) {
//			b=new int[a];
//			e.printStackTrace();
//			for(int i=0;i<a;i++) {
//				b[i]=1;
//			}
//			System.out.print("ԭ����ֻ��3����������b������:");
//			for(int i=0;i<a;i++) {
//				System.out.print(b[i]+" ");
//			}			
//		}
//	}
}
