package com.practice.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		String path = "F:/Jspiders/eclipse_progs/Practice/Files/sample.txt";
		File f1 = new File(path);
		
		FileWriter fw = null;
		try {
			 fw = new FileWriter(f1);
			 fw.write("These are some great words by - Keval Borkar");
			 fw.write("\nAre you Happy?");
			 System.out.println("Written in the File.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
