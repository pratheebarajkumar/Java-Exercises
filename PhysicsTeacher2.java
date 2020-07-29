package com.JavaOOPS.com;

class Teacher1{
	private String designation="Teacher";
	private String collegeName="BegginersBook";
	
	public String getDesignation() {
		 return designation;
	}
	protected void setDesignation(String designation) {
		this.designation=designation;
		
	}
	protected String getcollegeName() {
		return collegeName;
		
	}
	protected void setcollegeName(String collegeName) {
		this.collegeName=collegeName;
		
	}
	void does() {
		System.out.println("Teaching");
	}
}


public class PhysicsTeacher2 extends Teacher1{

	String mainSubject="Physics";
	public static void main(String[] args) {
		PhysicsTeacher2 obj= new PhysicsTeacher2();
		System.out.println(obj.getcollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
		

	}

}
