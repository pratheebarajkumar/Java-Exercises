package com.JavaOOPS.com;

interface Animal{
	public void sound();
	public void sleep();
	
}
class Pig implements Animal{

	@Override
	public void sound() {
		System.out.println("The pig says: wee wee");
		
	}

	@Override
	public void sleep() {
		System.out.println("The pig is sleeping:zzzzZZZ");

		
	}
	
}





public class JavaInterface {

	public static void main(String[] args) {
		Pig myPig=new Pig();
		myPig.sound();
		myPig.sleep();

	}

}
