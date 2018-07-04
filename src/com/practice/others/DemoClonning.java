package com.practice.others;

public class DemoClonning {

	public static void main(String[] args) {
		EmployeeClass E1 = new EmployeeClass(1, "Keval", 1230.20);
		Object obj  = E1.clone();
		EmployeeClass eref = (EmployeeClass) obj ; 
		System.out.println("Eid    :"+eref.id);
		System.out.println("Name   :"+eref.Name);
		System.out.println("Salary :"+eref.salary);
	}

}
