package com.demo.test;

public class BaseForPoly {
	
	 int roll;
	
	 String name;

	public BaseForPoly() {
		super();
	}

	public BaseForPoly(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String generateId() {
		String id=roll+name;
		return id;
	}
	
	@Override
	public String toString() {
		return "BaseForPoly [roll=" + roll + ", name=" + name + "]";
	}
	
	
}
