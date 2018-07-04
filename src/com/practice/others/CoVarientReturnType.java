package com.practice.others;

class Sample {
	public Object test() {
		System.out.println("Executing test() in Sample class");
		return null;
		
	}
}
public class CoVarientReturnType extends Sample{
	public String test() {
		System.out.println("Executing test() in CoVarientReturnType class");
		return null;
		
	}
	public static void main(String[] args) {
		CoVarientReturnType ref = new CoVarientReturnType();
		
		ref.test();
	}
}
