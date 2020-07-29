package com.JavaOOPS.com;

class Parentclass{
	
	Parentclass(){
		System.out.println("Comstructor of Parent");
	}
	void disp() {
		System.out.println( "Parent method");
	}
}



public class Javaexample extends Parentclass{
	
	Javaexample(){
		System.out.println("Constructor of Child");
	}
	
	void disp() {
		System.out.println("Child method");
		super.disp();
	}
	

	public static void main(String[] args) {

Javaexample obj=new Javaexample();
obj.disp();
	}

}
