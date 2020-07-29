package com.JavaOOPS.com;

class Fish2{
	int age=2;
	 
		}
 
class Gold extends Fish2{
	String colour="Gold";
}

public class FishQuestion2 extends Gold{
      String tank=" Fish2 lives in tank";
	public static void main(String[] args) {
		FishQuestion2 F2= new FishQuestion2();
		System.out.println(F2.age + "yrs old" + F2.tank + " whose colour is " + F2.colour);

	}

}
