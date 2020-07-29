package com.JavaOOPS.com;

class Teacher{
	String designation="Teacher";
	String collegeName="BeginnersBook";
	void does() {
		System.out.println("Teaching");
	}
}



public class PhysicsTeacher extends Teacher {
	String mainSubject="Physics";

	public static void main(String[] args) {

PhysicsTeacher obj=new PhysicsTeacher();
System.out.println(obj.mainSubject);
System.out.println(obj.collegeName);
System.out.println(obj.designation);
obj.does();
	}

}
