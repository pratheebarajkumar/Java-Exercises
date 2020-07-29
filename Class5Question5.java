package com.JavaOOPS.com;

class Adder{
	static int total(int a,int b) {
		return a+b;
		}
	static  double total(double a ,double b ) {
		return a+b;
	}
}

public class Class5Question5 {

	public static void main(String[] args) {
	
System.out.println(Adder.total(30, 40));
System.out.println(Adder.total(25.5, 36.5));
	}

}
