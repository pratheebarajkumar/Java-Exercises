package com.JavaOOPS.com;

import java.io.File;
import java.sql.Date;

import javax.swing.filechooser.FileFilter;

public class JavaInputOutput {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\Admin\\Desktop\\Mcit Docs");
		
		String[] filelist= file.list();
		for(String e2:filelist) {
			System.out.println(e2);
		}
		File file1= new File("C:\\Users\\Admin\\Desktop\\Mcit Docs\\class5Q4.txt");
			if (file1.exists()) {
				System.out.println(file1.getAbsolutePath()+"yes file exists");
			}
			else {
				System.out.println(file1.getAbsolutePath() +"file doesnot extist");
			}
			
			if (file1.canRead() && file1.canWrite()) {
				System.out.println(file1.getAbsolutePath()+  "file is readable and writable");
			}
			else {
				System.out.println(file1.getAbsolutePath() +  "File is neither readable nor writable");
				
			}
			
			if(file1.isDirectory() || file1.isFile()) {
				System.out.println("file is either a directory or a file");
			}
			else {
				System.out.println("file is neither a directory or a file");
			}
			 Date date=new Date(file.lastModified());
			 System.out.println(date);
	}

}
