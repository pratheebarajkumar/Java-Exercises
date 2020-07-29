package com.JavaOOPS.com;

class SimpleCalculator{
	int add(int a ,int b)
	{
		return a+b;
	}
	int add(int a ,int b,int c) {
		return a+b+c;
	}
}








public class MethodLOverloading {

	public static void main(String[] args) {
		SimpleCalculator s=new SimpleCalculator();
		System.out.println(s.add(10, 20));
		System.out.println(s.add(10,20, 30));

	}

}
