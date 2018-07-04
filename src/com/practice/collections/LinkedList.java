package com.practice.collections;


public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<Integer> lkn = 
					new java.util.LinkedList<Integer>();
		
		lkn.add(50);
		lkn.add(75);
		lkn.add(24);
		lkn.add(22);
		lkn.add(19);
		lkn.add(83);
		System.out.println("Size - "+lkn.size());
		for (int i = 0; i < lkn.size(); i++) {
			System.out.println(lkn.get(i));
		
		}
		
	
	}
	
}
