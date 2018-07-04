package com.practice.others;

public class EmployeeClass implements Cloneable{
	int id ;
	String Name; 
	double salary;
	
	public EmployeeClass(int id ,String Name,double salary) {
		this.id = id  ;
		this.Name = Name; 
		this.salary = salary;
	}
	
	@Override
	public Object clone(){
		Object obj = null;
		try {
			obj =  super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	
	}
}
