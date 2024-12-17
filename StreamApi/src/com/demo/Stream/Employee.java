package com.demo.Stream;

import java.util.Date;

public class Employee {
	private String name;
	private Double salary;
	private Date join;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getJoin() {
		return join;
	}
	public void setJoin(Date join) {
		this.join = join;
	}
	public Employee() {
		super();
	}
	
	public Employee(String name, Double salary, Date join) {
		super();
		this.name = name;
		this.salary = salary;
		this.join = join;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
