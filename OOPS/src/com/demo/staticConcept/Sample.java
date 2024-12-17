package com.demo.staticConcept;

public class Sample {
	int no;
	static int amt;
	
	public static void show() {
		System.out.println("Inside static method");
		System.out.println("The amount is "+amt);
	}
	public void greet() {
		System.out.println("Good Morning");
	}
	
	public Sample() {
		System.out.println("Inside default constructor");
	}

	static {
		System.out.println("I am inside the static block");
		amt=100;
	}
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[]args) {
		Sample.show();
		Sample s=new Sample();
		s.greet();
	}
}
