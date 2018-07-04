package com.practice.collections;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		
		java.util.LinkedHashSet<Integer> ref = 
						    new java.util.LinkedHashSet<Integer>();
	
		ref.add(1);
		ref.add(2);
		ref.add(3);
		ref.add(4);
		ref.add(5);
		
		Iterator<Integer> i1 = ref.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());			
		}
		
	
		
		
	}

}
