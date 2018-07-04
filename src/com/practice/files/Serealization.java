package com.practice.files;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class OneSexyClass implements Serializable{
	 String Name ;
	 long Id ;
	
	public OneSexyClass( String Name,long Id ) {
		this.Name = Name;
		this.Id = Id;
	}
}
public class Serealization {

	public static void main(String[] args) {
		
		String pathname = "F:/Jspiders/eclipse_progs/Practice/Files/SerializationDemo.ser";
		File f1 = new File(pathname);
		OneSexyClass ref = new OneSexyClass("Priyanka", 15203);
		OneSexyClass ref1 = new OneSexyClass("Parineeti", 182203);
		FileOutputStream fout = null;
		ObjectOutputStream ObjOut = null;
		try {
			  f1.createNewFile();
			  fout = new FileOutputStream(f1);
			  ObjOut = new ObjectOutputStream(fout);
			  ObjOut.writeObject(ref);
			  System.out.println("Object written");
			  ObjOut.writeObject(ref1);
			  System.out.println("Object written");
			  
			  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				ObjOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
