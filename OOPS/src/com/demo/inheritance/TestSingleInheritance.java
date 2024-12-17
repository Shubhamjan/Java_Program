package com.demo.inheritance;

public class TestSingleInheritance {
public static void main(String[] args) {
	Exam e=new Exam();
	e.setData(1, "Shubham", "shubham@gmail.com", "8596456789");
	e.showData();
	e.setMarks(100, 100);
	e.showMarks();
}
}
