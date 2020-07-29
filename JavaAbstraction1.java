package com.JavaOOPS.com;

abstract class Shape{
	String colour;
	
	abstract double area(); 
	public abstract String toString();
	
	public Shape(String colour) {
		System.out.println("Shape constructor called");
		this.colour=colour;
		}
	
	public String getcolour() {
		return colour;
		
	}
}

class Circle extends Shape{
	
	double radius;

	public Circle(String colour,double radius) {
		super(colour);
    System.out.println("Circle constrcutor is called");
    this.radius=radius;
	}

	@Override
	double area() {
		
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		
		return "Circle colour is" + super.colour+ "and area is"+ area();
	}
	
}

 class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String colour,double length,double width) {
		super(colour);
		System.out.println("Rectangle constructor called");
		this.length=length;
		this.width=width;
	
	}

	@Override
	double area() {
		
		return length*width;
	}

	@Override
	public String toString() {
	
		return "Rectangle colour is" +super.colour+"an area is" + area();
	}
	
}


public class JavaAbstraction1 {

	public static void main(String[] args) {
		Shape s1=new Circle("Red",2.2);
		Shape s2=new Rectangle("Blue",2,4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		

	}

}
