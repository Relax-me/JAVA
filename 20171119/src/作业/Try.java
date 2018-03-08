package ื๗าต;

import java.util.Scanner;



public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}
	public static void a()throws NumberFormatException {
		Scanner scanner=new Scanner(System.in);
		String hex=scanner.next();
		scanner.close();
		int dec;
		try {
	        Integer.parseInt(hex, 16);
	    } catch (NumberFormatException e) {
	    	throw new NumberFormatException();
	    }
		dec=Integer.parseInt(hex,16);
		System.out.println(dec);
	}

}
