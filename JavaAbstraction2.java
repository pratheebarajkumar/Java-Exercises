package com.JavaOOPS.com;

 abstract class Employee{
	 private String name;
	 private int Paymentperhr;
	 
	 
	 public Employee(String name,int Paymentperhr) {
		 this.setName(name);
		 this.setPaymentperhr(Paymentperhr);
	 }
	public abstract int CalculateSalary();
	public abstract String toString();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPaymentperhr() {
		return Paymentperhr;
	}
	public void setPaymentperhr(int paymentperhr) {
		Paymentperhr = paymentperhr;
	}
}
 class contractor extends Employee{

	private int workingHours;

public contractor(String name, int Paymentperhr,int workingHours) {
		super(name, Paymentperhr);
		this.workingHours=workingHours;
		
	}

@Override
public int CalculateSalary() {

	return getPaymentperhr() * workingHours;
}

@Override
public String toString() {

	return "Employee"+ getName()+ "works"+ workingHours+ " hours and her salary is"+CalculateSalary();
}
}
 
 class FullTimeEmployee  extends Employee{

	public FullTimeEmployee(String name, int Paymentperhr) {
		super(name, Paymentperhr);
		
	}

	@Override
	public int CalculateSalary() {
		
		return getPaymentperhr()*8;
	}

	@Override
	public String toString() {
		
		return "Employee"+ getName()+ "works"+ 8 + "hours and her salary is"+CalculateSalary();
	}
	
}
public class JavaAbstraction2 {

	public static void main(String[] args) {
		Employee E1=new contractor("Pratheeba",60,8);
		System.out.println(E1.toString());
		Employee E2=new FullTimeEmployee("Rajkumar",60);
		System.out.println(E2.toString());
	}

}

