package Try;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ��������");
		num=scanner.nextInt();
		scanner.close();
		try {
			panduan(num);
		} catch (ZhengException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void panduan(int num) throws ZhengException {
		if(num<=0) {
			throw new ZhengException(num);
		}			
		else {
			System.out.println("������Ϊ��"+num);
		}
	}

}
