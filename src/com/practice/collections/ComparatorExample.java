package com.practice.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample 
{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Sort based on Id
		Comparator<Object> cmpt1 = (Object obj1 , Object obj2 )->{
			
			StudentClass st1 = (StudentClass) obj1 ;
			StudentClass st2 = (StudentClass) obj2 ;
			
			if(st1.id > st2.id ) {
				return 1;
			}else if(st1.id < st2.id) {
				return -1;
			}else {
				return 0 ;
			}

		};
		
		//Sort based on marks
		Comparator<Object> cmpt2 = (Object obj1 , Object obj2 )->{
			
			StudentClass st1 = (StudentClass) obj1 ;
			StudentClass st2 = (StudentClass) obj2 ;
			
			if(st1.marks > st2.marks ) {
				return 1;
			}else if(st1.marks < st2.marks) {
				return -1;
			}else {
				return 0 ;
			}

		};
		//Sort based on Name
		Comparator<Object> cmpt3 = (Object obj1 , Object obj2 )->{
					
			StudentClass st1 = (StudentClass) obj1 ;
			StudentClass st2 = (StudentClass) obj2 ;
					
			int res = st1.name.compareTo(st2.name);
					
			return res;

		};
		
		//TreeSet<StudentClass> ts1 = new TreeSet<StudentClass>(cmpt1);
		//TreeSet<StudentClass> ts1 = new TreeSet<StudentClass>(cmpt2);
		TreeSet<StudentClass> ts1 = new TreeSet<StudentClass>(cmpt3);
		 
		ts1.add(new StudentClass(1, "Keval", 507.6));
		ts1.add(new StudentClass(2, "Aga", 577.6));
		ts1.add(new StudentClass(3, "Faizan", 597.6));
		ts1.add(new StudentClass(4, "Akshay", 509.6));
		ts1.add(new StudentClass(5, "Apeksha", 510.6));
		 
		Iterator<StudentClass> i1= ts1.iterator();
		while (i1.hasNext()) 
		{
			System.out.println(i1.next());			
		}
	}

}
