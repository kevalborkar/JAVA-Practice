package com.practice.collections;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vref = new Vector<String>();
		
		vref.add("Keval");
		vref.add("Akshay");
		vref.add("Faizaan");
		vref.add("Kasam");
		
		vref.add("Apeksha");
	
		for (int i = 0; i < vref.size(); i++) {
			System.out.println(vref.get(i));
		}
		
		
	}

}
