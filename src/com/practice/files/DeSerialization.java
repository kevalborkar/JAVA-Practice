package com.practice.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) {
		String pathname = "F:/Jspiders/eclipse_progs/Practice/Files/SerializationDemo.ser";
		File f1 = new File(pathname);
		FileInputStream in = null;
		ObjectInputStream Objin = null;
		try {
			 in = new FileInputStream(f1);
			 Objin = new ObjectInputStream(in);
			 Object data1 = Objin.readObject();
			 
			 OneSexyClass ref = (OneSexyClass) data1 ; 
			 System.out.println("Name: " + ref.Name);
			 System.out.println("Id : " + ref.Id);
			 
			 Object data2 = Objin.readObject();
			 
			 OneSexyClass ref2 = (OneSexyClass) data2 ; 
			 System.out.println("Name: " + ref2.Name);
			 System.out.println("Id : " + ref2.Id);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				Objin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
