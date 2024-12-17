package com.demo.exception;

public class Student {
	
	int roll;
	
	String name;
	
	int marks;

	public Student() {
		super();
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		
		if(this.marks<0|| this.marks>100) {
			System.out.println("In ");
			throw new InvalidMarkException("Invalid marks");
			
		}else {
			this.marks = marks;
		}
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if(this.marks<0|| this.marks>100) {
			throw new InvalidMarkException("Invalid marks"); 
		}else {
			this.marks = marks;
		}
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
