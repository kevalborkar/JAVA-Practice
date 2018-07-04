package com.practice.secondpkg;

public class StringToArray {
	
	public static void conv(String str) {
		char ch[] = str.toCharArray();
		for(int i =0; i<ch.length; i++) {
			System.out.println("ch["+i+"]= "+ch[i]);
		}
	}

	public static void main(String[] args) {
		String st = "Java";
		conv(st);
	}

}
