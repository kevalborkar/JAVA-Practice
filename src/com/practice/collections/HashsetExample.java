package com.practice.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> hsh = new HashSet<Integer>();
		
		hsh.add(10);
		hsh.add(20);
		hsh.add(30);
		hsh.add(40);
		hsh.add(50);
		
		
		Iterator<Integer> i1 = hsh.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		

	}

}
