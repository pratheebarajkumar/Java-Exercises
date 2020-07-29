package com.JavaOOPS.com;

import java.util.*;

public class Arraylistsdemo {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Ajay");
list.add("Ravi");
list.add("Vijay");

@SuppressWarnings("rawtypes")
Iterator itr=list.iterator();
//Traversing using list operator
while(itr.hasNext()) {
	System.out.println(itr.next());
}

//traversing using foreach method,using lambda expression
list.forEach(a->{
	System.out.println(a);
});

//traversing through foreach remaining method
list.forEach(a->{
	System.out.println(a);
});

list.add(1, "gaurav");
System.out.println("After invoking add method"+ list);



ArrayList<String> list2=new ArrayList<String>();
list2.add("sonu");
list2.add("bongu");
list.addAll(list2);
System.out.println("After invoking add method"+ list);

ArrayList<String> list3=new ArrayList<String>();
list3.add("John");
list3.add("Steeve");
list.addAll(1, list3);
System.out.println("After invoking add method"+ list);
	}

}
