package com.practice.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		//File Location
		//F:\Jspiders\eclipse_progs\Practice\Files
		File f1 = new File("F:/Jspiders/eclipse_progs/Practice/Files/");
		f1.mkdir();
		//f1.delete();
		File f2 = new File("F:/Jspiders/eclipse_progs/Practice/Files/sample.txt");
		try {
			boolean res = f2.createNewFile();
			System.out.println("File Created " + res );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
