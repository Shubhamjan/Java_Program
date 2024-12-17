package com.demo.assignment;

public class Student {
	
	private int id;
	
	private String name;
	
	private double grade;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if(grade<100 && grade>0) {
			System.out.println("Grade applied");
			this.grade = grade;
		}else {
			System.out.println("Grade not applied");
			this.grade=0.0;
		}
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
