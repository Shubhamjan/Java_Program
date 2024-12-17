package com.demo.assignment;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		AdvanceCalculator ac=new AdvanceCalculator();
		
		System.out.println("The sum of two integer:- "+c.add(5, 3));
		System.out.println("The sum of three integer:- "+c.add(10, 14, 63));
		System.out.println("The sum of two double:- "+c.add(10.25, 15.32));
		int []a = {2,4,5,6};
		System.out.println("The sum of list of number:- "+ac.add(a));
	}
}
