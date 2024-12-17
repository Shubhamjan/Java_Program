package com.demo.inheritance;

public class Manager extends Employee {
	
	double bonus;
	
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	
	public void show() {
		System.out.println("The bonus for Manager is "+this.bonus);
	}
}
