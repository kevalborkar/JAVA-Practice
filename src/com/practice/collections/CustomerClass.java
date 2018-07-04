package com.practice.collections;

public class CustomerClass implements Comparable<Object>{
	String name ;
	int priority;
	
	CustomerClass(String name,int priority) {
		this.name = name;
		this.priority= priority;
	}

	@Override
	public int compareTo(Object obj) {
		CustomerClass cus = (CustomerClass) obj;
		int val = cus.priority - this.priority;
		return val;
	}
	@Override
	public String toString() {
		return "Name: "+this.name+", Priority : "+this.priority;
	}
	
	
}