package com.JavaOOPS.com;

import java.util.ArrayList;
import java.util.List;

class Book{
	int id,quantity;
	String name,author,publisher;
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.author=author;
		this.id=id;
		this.name=name;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
}

public class ArrayListBook {

	public static void main(String[] args) {
	
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
		
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    
	    list.forEach(b->{
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    });

	}

}
