package com.demo.assignment;

public class Manager extends Employee{
	
	private double bonus2;
	
//	private double salary;
	
	public Manager(String name,double salary,double bonus2) {
		super(name,salary);
		this.bonus2=bonus2;
//		this.salary=salary;
	}

	@Override
	public double calculateBonus() {
		return (salary*0.2)+bonus2;
	}
}
