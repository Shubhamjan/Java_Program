package com.demo.assignment;

public class Company1 {
	
	protected String companyName;

	public Company1() {
		super();
	}

	public Company1(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company1 [companyName=" + companyName + "]";
	}

	
}
