package com.practice.collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Keval");
		ts.add("Apeksha");
		ts.add("Faizaan");
		ts.add("Akshay");
		ts.add("Aga Kasam");
		String res = ts.pollFirst();
		System.out.println(res +" - removed");
		res = ts.pollLast();
		System.out.println(res+" - removed" );
		
		Iterator<String> i1 = ts.iterator();
		System.out.println("While Loop --" );
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
