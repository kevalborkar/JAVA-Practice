package com.practice.threads;

class MyMobileThread extends Thread{
	@Override
	public void run() {
		System.out.println("OmG I aM Mobile Thread");
	}
}

class MyLaptopThread extends Thread{
	@Override
	public void run() {
		System.out.println("OmG I aM Laptop Thread");
	}
}

class MyOfficeThread extends Thread{
	@Override
	public void run() {
		System.out.println("OmG I aM Office Thread");
	}
}

public class ThreadExtended {

	public static void main(String[] args) {
		
	System.out.println(" I aM iN  Main method");
	MyMobileThread mobile = new MyMobileThread();
	MyOfficeThread office = new MyOfficeThread();
	MyLaptopThread laptop = new MyLaptopThread();
	
	mobile.start();
	office.start();
	laptop.start();
	System.out.println("Main method Got oVerred");
	}

}
