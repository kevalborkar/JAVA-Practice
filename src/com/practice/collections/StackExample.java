package com.practice.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> ref = new Stack<String>();
		
		ref.push("Keval");
		ref.push("Aga");
		ref.push("Akshay");
		ref.push("Faizan");
		ref.push("Apeksha");
		
		int size = ref.size();
		System.out.println("--------------");
		for (int i = 0; i < size; i++) {
			System.out.println(ref.pop());
		}
		
	}

}
