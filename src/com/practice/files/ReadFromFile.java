package com.practice.files;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		String path = "F:/Jspiders/eclipse_progs/Practice/Files/sample.txt";
		File f1 = new File(path);
		FileReader fr = null;
		try {
			 fr = new FileReader(f1);
			 int data = fr.read();
			 while(data != -1) {
				 System.out.print((char)data);
				 data = fr.read();
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
