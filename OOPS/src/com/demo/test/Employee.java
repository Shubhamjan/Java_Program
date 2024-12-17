package com.demo.test;

public class Employee {
	private int id;
	
	private String name;
	
	private String designation;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void Show() {
		System.out.println("Details :\n"+"Id is "+id+"\tName: "+name+"\tDesignation: "+designation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(1);
		e.setName("Shubham");
		e.setDesignation("Engineer");
		e.Show();
	}

}
