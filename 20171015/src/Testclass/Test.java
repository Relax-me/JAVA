package Testclass;

public class Test {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++){
			for(int j=1;j<=9-i;j++){
				System.out.print("\t");
			}
			for(int k=1;k<=i;k++){
				System.out.print((int)Math.pow(2, k-1)+"\t");
			}
			for(int l=i-1;l>=1;l--){
				System.out.print((int)Math.pow(2, l-1)+"\t");
			}
			System.out.println();
		}	
	}
}
