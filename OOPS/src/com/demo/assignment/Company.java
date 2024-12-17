package com.demo.assignment;

import java.util.List;

public class Company {
	
	String companyName;
	
	List<Employee1> lst;

	public Company(String companyName) {
		super();
		this.companyName = companyName;
		Department d=new Department("R&D");
		Employee1 e1=new Employee1("Abc",d);
		Employee1 e2=new Employee1("xyz",d);
		lst.add(e1);
		lst.add(e2);
		this.lst = lst;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Employee1> getLst() {
		return lst;
	}

	public void setLst(List<Employee1> lst) {
		this.lst = lst;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", lst=" + lst + "]";
	}
}
