package Integer;
//
//import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;

public class test {
	static Scanner scanner=new Scanner(System.in);
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		long a1=System.currentTimeMillis();
//		int num=100;
//		Integer integer=new Integer(num);
//		String snum="100";
//		Integer integer2=new Integer(snum);	
//		System.out.println(integer+"  "+integer2);
//		System.out.println(String.valueOf(3.14));
//		System.out.println(Integer.parseInt("1001010",2));
//		String string="123,456,789,";
//		String[] s=string.split(",");
//		for(int i=0;i<s.length;i++)
//			System.out.println(s[i]);
//		Long string2=127l;
//		Long string3=127l;
//		
//		String string4="cyh10000";
//		String string5="cyh10000";
//		System.out.println(string2==string3);
//		long a2=System.currentTimeMillis();
//		System.out.println(a2-a1);
//		int a[]= {1,2,3,4,5};
//		int b[]= {4,5,6,7,8};
//		System.arraycopy(a, 2, b, 2, 2);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		
//		System.out.println(Math.random());
//		System.out.println(new Random().nextInt(10000));
//		String z1="123";
//		String z2="456";
//		System.out.println("123456"==("123"+z2));
		System.out.println("请输入账户、密码：");
		if(!panduan()) {
			System.out.println("你还有两次机会");
			if(!panduan()) {
				System.out.println("你还有一次机会");
				if(!panduan()) {
					System.out.println("登陆失败，账户被锁定！");
				}
			}
		}	
		scanner.close();
	}
	static boolean panduan() {
		
		if(scanner.next().equals("123456")&&scanner.next().equals("654321"))
		{
			System.out.println("登陆成功！");
			return true;
		}
		else 
		{
			return false;
		}
		
	}
}
