package com.practice.threads;

public class TheardUsingLambda {
	
	public static void main(String[] args) {
		
		Runnable ref1 = ()->{
			System.out.println("I am a sexy Lambda function ref1");
		};
		Runnable ref2 = ()->{
			System.out.println("I am a sexy Lambda function ref2");
		};
		Runnable ref3 = ()->{
			System.out.println("I am a sexy Lambda function ref3");
		};
		Runnable ref4 = ()->{
			System.out.println("I am a sexy Lambda function ref4");
		};
		Runnable ref5 = ()->{
			System.out.println("I am a sexy Lambda function ref5");
		};
		Runnable ref6 = ()->{
			System.out.println("I am a sexy Lambda function ref6");
		};
		
		Thread t1 = new Thread(ref1);
		Thread t2 = new Thread(ref2);
		Thread t3 = new Thread(ref3);
		
		Thread t4 = new Thread(ref4);
		Thread t6 = new Thread(ref6);
		Thread t5 = new Thread(ref5);
		//Setting Priorities
		t1.setPriority(1);
		t4.setPriority(6);
		t5.setPriority(7);
		t3.setPriority(3);
		
		t1.start();
		t3.start();
		t2.start();
		
		t5.start();
		t4.start();
		t6.start();
		
		//Setting Priority & getting Priority is possible
		//Setting Name & getting Name is possible
		//but we can only get the ID but can't set it
		
		t1.setName("Sexy Lambda 1");
		t4.setName("Sexy Lambda 4");
		t5.setName("Sexy Lambda 5");
		t3.setName("Sexy Lambda 3");
		
		
		
		System.out.println("Names of few Lambda's who are sexy: ");
		String T1 = t1.getName();	
		String T4 = t4.getName();
		String T5 = t5.getName();
		String T3 = t3.getName();
		System.out.println(T1+ ","+T4+","+T5+","+T3);
		
		System.out.println("Getting Priorities and ID's");
		long Id1= t1.getId() ;
		int Pr1 = t1.getPriority();
		
		long Id4= t4.getId() ;
		int Pr4 = t4.getPriority();
		
		long Id2= t2.getId() ;
		int Pr2 = t2.getPriority();
		
		long Id6= t6.getId() ;
		int Pr6 = t6.getPriority();
		
		System.out.println("Thread -1, ID: "+Id1 +" , Pr1: "+Pr1);
		System.out.println("Thread -4, ID: "+Id4 +" , Pr4: "+Pr4);
		System.out.println("Thread -2, ID: "+Id2 +" , Pr2: "+Pr2);
		System.out.println("Thread -6, ID: "+Id6 +" , Pr6: "+Pr6);
		
	}
}
