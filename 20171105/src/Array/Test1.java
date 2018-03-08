package Array;

import java.util.Random;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=100;
		int[] arr=new int[sum];
		Random random=new Random();
		System.out.println("原数据为：");
		for(int i=0;i<sum;i++) {
			arr[i]=random.nextInt(sum);
			System.out.print(arr[i]+" "+(((i+1)%25==0)?"\n":""));
		}
		long t1,t2;
		t1=System.currentTimeMillis();
		for(int i=0;i<sum-1;i++)
			for(int j=0;j<sum-1-i;j++)
			{
				if(arr[j]>arr[j+1])
					arr[j]=arr[j+1]+arr[j]-(arr[j+1]=arr[j]);
			}
		t2=System.currentTimeMillis();
		System.out.println("\n冒泡排序:(消耗时间"+(t2-t1)+"ms)");
		for(int i=0;i<sum;i++) {
			System.out.print(arr[i]+" "+(((i+1)%25==0)?"\n":""));
		}
		int[] arr2=new int[sum];
		t1=System.currentTimeMillis();
		for(int i=0;i<sum;i++) {
			arr2[arr[i]]++;
		}
		t2=System.currentTimeMillis();
		System.out.println("\n桶排序:(消耗时间"+(t2-t1)+"ms)");
		for(int i=0;i<sum;i++) {
			for(int j=0;j<arr2[i];j++)
			System.out.print(i+" "+(((i+1)%25==0)?"\n":""));
		}
		
	}

}
