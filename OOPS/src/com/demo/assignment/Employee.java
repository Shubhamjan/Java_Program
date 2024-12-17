package com.demo.assignment;

public class Employee {
	private String name;
	
	protected double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public double calculateBonus() {
		return this.salary*0.1;
	}
}
