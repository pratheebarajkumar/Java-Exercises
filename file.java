package com.JavaOOPS.com;

import java.io.File;

public class file {

	public static void main(String[] args) {
		File myfile=new File("C:\\Users\\Admin\\Documents\\Pratheeba Rajkumar CC resume.docx");

		
		if(myfile.exists()) {
			System.out.println( myfile.getName() + "exixts");
			System.out.println("the file is " + myfile.length() + "bytes long");
			
			if(myfile.canRead()) {
				System.out.println("ok  to read");
			}
			else {
				System.out.println("file not ok to read");
			}
			if(myfile.canWrite()) {
				System.out.println("ok to  write");
			}
			else {
				System.out.println("not ok to write");
			}
		System.out.println("path:" + myfile.getAbsolutePath());
		}
		else {
			System.out.println("file doesnot exixts");
		}
	}

}
