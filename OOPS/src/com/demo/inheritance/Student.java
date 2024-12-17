package com.demo.inheritance;

public class Student {
	
	int roll;
	
	String name;
	
	String email;
	
	String mobile;
	
	public void setData(int roll,String name,String email,String mobile) {
		this.roll=roll;
		this.name=name;
		this.email=email;
		this.mobile=mobile;
	}
	
	public void showData() {
		System.out.println("Student Roll :"+this.roll);
		System.out.println("Student name :"+this.name);
		System.out.println("Student email :"+this.email);
		System.out.println("Student mobile :"+this.mobile);
//		System.out.println("Student Roll :"+this.roll);
	}
}
