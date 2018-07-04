package com.practice.collections;
import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> ref = new ArrayList<String>();
		
		ref.add("Aga");
		ref.add("25");
		ref.add("Keval");
	
		
		for (int i = 0; i < ref.size(); i++) {
			System.out.println(ref.get(i));
		}
		

	}

}
