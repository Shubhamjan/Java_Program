package com.demo.Comparator;

public class Employee {

	private int id;
	
	private static int c;
	
	 static {
		 c=0;
	 }
	
	private String name;
	
	private String dept;
	
	private long salary;

	public Employee() {
		super();
	}

	public Employee(String name, String dept, long salary) {
		super();
		c++;
		this.id =c;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
