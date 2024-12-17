package com.demo.assignment;

public class TestBook {
	public static void main(String[] args) {
		Book b1=new Book("Math Tricks","Abc",200.00,20);
		Book b2=new Book("Java","XYZ",500.00,120);
		System.out.println("The details for book 1:-");
		System.out.println(b1.toString());
		System.out.println("The Total price:-");
//		b1.displayPrice();
		System.out.println("---------------------");
		System.out.println("The details for book 2:-");
		System.out.println(b2.toString());
		System.out.println("The Total price:-");
//		b2.displayPrice();
		
	}
}
