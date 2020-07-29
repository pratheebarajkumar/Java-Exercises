package com.JavaOOPS.com;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a[]=new int[2];
			System.out.println( "Element 3" + a[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:" + e);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
	}
	catch(Exception e) {
		System.out.println("Parent exception occurs");
	}
	
	System.out.println("Out o the block");
}
}