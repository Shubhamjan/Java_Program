package com.demo.inheritance;

public class Typist extends Employee{
	
	double wages;
	
	public void setWage(double wages) {
		this.wages=wages;
	}
	
	public void showWage() {
		System.out.println("The wages for typist is "+wages);
	}
}
