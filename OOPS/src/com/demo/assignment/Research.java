package com.demo.assignment;

public class Research extends Company1{
	
	private int employeeCount;

	public Research() {
		super();
	}

	public Research(int employeeCount,String companyName) {
		super(companyName);
		this.employeeCount = employeeCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public String toString() {
		return "Research [employeeCount=" + employeeCount + "]";
	}
	
	
}
