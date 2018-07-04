package com.practice.threads;
class TheClass implements Runnable{
	public void run() {
		
	System.out.println("This is Overrided Run from "
				+ "Runnable Interface! in TheClass ");
		
	}
}

class OneMoreClass extends TheClass implements Runnable{

	@Override 
	public void run() {
		System.out.println("This is Overrided Run from "
				+ "Runnable Interface!");

	}
	
}

public class TheardImplemented {
	
	public static void main(String[] args) {
		OneMoreClass ref  = new OneMoreClass();
		Thread t1 = new Thread(ref);
		t1.start();
		TheClass ref2  = new TheClass();
		Thread t2 = new Thread(ref2);
		t2.start();
	}
}
