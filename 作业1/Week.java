package ��ҵ1;
import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 0;
			if(s.hasNext()){
				n=s.nextInt();
			}
			switch(n){
				case 1: System.out.println("����һ");break;
				case 2:	System.out.println("���ڶ�");break;
				case 3:	System.out.println("������");break;
				case 4:	System.out.println("������");break;
				case 5:	System.out.println("������");break;
				case 6:	System.out.println("������");break;
				case 7:	System.out.println("������");break;
				default:System.out.println("�������");break;
			}
			s.close();
	}

}
