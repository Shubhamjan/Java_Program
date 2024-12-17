package com.demo.inheritance;

public class Employee {
	
	int emid;
	
	String name;
	
	double salary;
	
	public void setData(int emid,String name,double salary){
		this.emid=emid;
		this.name=name;
		this.salary=salary;
	}
	public void showData() {
		System.out.println("Employee Id :-"+this.emid);
		System.out.println("Name :-"+this.name);
		System.out.println("Salary :-"+this.salary);
		
	}
}
