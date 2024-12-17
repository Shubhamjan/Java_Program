package com.demo.assignment;

public class Employee1 {
	
	String name;
	
	Department d;

	public Employee1(String name, Department d) {
		super();
		this.name = name;
		this.d = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", d=" + d + "]";
	}
}
