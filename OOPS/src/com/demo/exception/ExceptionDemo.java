package com.demo.exception;

import java.util.Scanner;

public class ExceptionDemo {
	public void show() {
		int a,b;
		System.out.println("Enter any two numbers:-");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		try {
			System.out.println("Division: "+(a/b));
		}catch(Exception e) {
//			System.out.println(e);
//			System.out.println(e.getMessage());
			System.out.println("You are trying to divide y zero");
//			e.printStackTrace();
		}
		
		System.out.println("Multiplication: "+(a*b));
		
	}
	public static void main(String[]args) {
		Demo2 d1=new Demo2();
		d1.show();
	}
}
