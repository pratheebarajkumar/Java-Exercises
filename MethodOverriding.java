package com.JavaOOPS.com;

class ABC{
	public void mymethod() {
		System.out.println("Overridden method");
	}
}


public class MethodOverriding {
	public void mymethod() {
		System.out.println("Overriding method");
		
	}
		
	public static void main(String[] args) {
    MethodOverriding obj= new MethodOverriding();
    
    obj.mymethod();
    
    ABC obj1=new ABC();
    obj1.mymethod();
    
   
    

	}

}
