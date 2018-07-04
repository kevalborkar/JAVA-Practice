package com.practice.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) {
		String pathname = "F:/Jspiders/eclipse_progs/Practice/Files/sample.property";
		File f1 = new File(pathname);
		FileReader fr = null;
		Properties prop = null;
		try {
			/*f1.createNewFile();
			System.out.println("File Created");*/
			fr = new FileReader(f1);
			prop = new Properties();
			prop.load(fr);
			
			String usrname  = prop.getProperty("username");
			String password = prop.getProperty("password");
			System.out.println("Username:" + usrname);
			System.out.println("Password:" + password);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
