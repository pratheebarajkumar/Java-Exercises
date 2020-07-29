package com.JavaOOPS.com;

abstract class Shape11{
	abstract double area();

	public Shape11() {
		System.out.println("Shape constructor is called");
	}

class Square extends Shape11{
int length;

public Square(int length) {
	this.length=length;
}
	@Override
	double area() {
		
		return length*length;
	}
	
}

class Rectangle extends Shape11{
	int length;
	int breadth;
	
	public Rectangle(int length,int  breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	double area() {
	
		return length*breadth;
	}
	
}


public class cLASS5q4 {

	public void main(String[] args) {
		Shape11 s1= new Square(5);
		System.out.println(s1.area());
		Shape11 s2=new  Rectangle(5,10);
		System.out.println(s2.area());
		

	}
}
}


