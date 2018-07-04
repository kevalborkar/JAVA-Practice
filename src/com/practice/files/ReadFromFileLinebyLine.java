package com.practice.files;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileLinebyLine {

	public static void main(String[] args) {
		String path = "F:/Jspiders/eclipse_progs/Practice/Files/sample.txt";
		File f1 = new File(path);
		FileReader fr = null;
		BufferedReader reader =null;
		try {
			 fr = new FileReader(f1);
			 reader = new BufferedReader(fr);
			 String data = reader.readLine();
			 while(data != null) {
				 System.out.print(data);
				 data = reader.readLine();
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
