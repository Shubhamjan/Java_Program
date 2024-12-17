package com.demo.inheritance;

public class Exam extends Student {
	
	int marks1,marks2;
	
	public void setMarks(int marks1,int marks2) {
		this.marks1=marks1;
		this.marks2=marks2;
	}
	
	public void showMarks() {
		System.out.println("Marks of first subject :"+marks1);
		System.out.println("Marks of second subject :"+marks2);
		
	}
}
