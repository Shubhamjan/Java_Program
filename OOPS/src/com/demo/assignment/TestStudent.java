package com.demo.assignment;

public class TestStudent {
	public static void main(String[] args) {
		Student st=new Student(1,"Abc");
		st.setGrade(10);
		System.out.println(st);
		System.out.println("----------------------");
		Student st1=new Student(2,"xyz");
		st1.setGrade(100);
		System.out.println(st1);
	}
}
