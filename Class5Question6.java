package com.JavaOOPS.com;

class ICICI{
	public String IR() {
		return "Interest rate is 5%";
	}
}
class RBC extends ICICI {
	public String IR() {
	return "Interest rate is  12%";
}
}

class Scotia extends RBC{
	public String IR() {
		return "Interest rate is 10.5";
	}
}
public class Class5Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scotia S=new Scotia();
      System.out.println(S.IR());
      RBC C=new RBC();
      System.out.println(C.IR());
      
	}

}
