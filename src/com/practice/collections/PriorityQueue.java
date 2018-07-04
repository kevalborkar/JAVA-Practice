package com.practice.collections;

public class PriorityQueue {

	public static void main(String[] args) {
		
		java.util.PriorityQueue<Object> pq = 
					new java.util.PriorityQueue<Object>();
		
		pq.add(new CustomerClass("Keval", 1));
		pq.add(new CustomerClass("Aga", 1));
		pq.add(new CustomerClass("Faizan", 3));
		pq.add(new CustomerClass("Akshay", 5));
		pq.add(new CustomerClass("Apeksha", 2));
		
		System.out.println("Size before-- "+ pq.size());
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
			
		}
		System.out.println("Size After-- "+ pq.size());

	}

}
