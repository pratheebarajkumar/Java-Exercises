package com.JavaOOPS.com;

interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class Greet implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
Greet obj = new Greet();  
obj.print();  
obj.show();  
 }  
}  