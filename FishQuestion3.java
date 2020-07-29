package com.JavaOOPS.com;

class Fish3{
	int age=2;
	 
		}

class Goldy extends Fish3{
	String colour="Gold";
}



public class FishQuestion3 extends Goldy{
    String tank=" Fish2 lives in tank";
	public static void main(String[] args) {
		FishQuestion3 F3= new FishQuestion3();
		System.out.println(F3.age + "yrs old" + F3.tank);
		
	}
}

