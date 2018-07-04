package com.practice.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		//This is when the Objects Are comparable and i want to 
		//implement in descending order and not natural ordering.
		Comparator<Object> cmp = (Object obj1 , Object obj2)->
		{
			String str1 = (String) obj1;
			String str2 = (String) obj2;
			
			//int sort = str1.compareTo(str2);
			int sort = str2.compareTo(str1);
			return sort;
			
		};
		
		TreeSet<String> tse = new TreeSet<String>(cmp);
		
		tse.add("Keval");
		tse.add("Kasam");
		tse.add("Prasad");
		tse.add("Ria");
		tse.add("Rahul");
		tse.add("Pooja");
		tse.add("Virat");
		tse.add("Nehal");	
		tse.add("Anusha");
		tse.add("Vaishnav");
		tse.add("Yash");
		
		
		Iterator<String> i1 = tse.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
 		

	}

}
