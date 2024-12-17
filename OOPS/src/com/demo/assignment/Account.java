package com.demo.assignment;

public class Account extends Company1 {
	
	private int EmployeeNo;

	public Account(int employeeNo,String companyName) {
		super(companyName);
		EmployeeNo = employeeNo;
	}

	public int getEmployeeNo() {
		return EmployeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		EmployeeNo = employeeNo;
	}

	@Override
	public String toString() {
		return "Account [EmployeeNo=" + EmployeeNo + "]";
	}
	
}
