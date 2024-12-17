package com.demo.exception;

import java.util.Scanner;

public class Demo2 {
	public void show() {
		int a,b;
		System.out.println("Enter any two numbers:-");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Division: "+(a/b));
		System.out.println("Multiplication: "+(a*b));
		
	}
	public static void main(String[]args) {
		Demo2 d1=new Demo2();
		d1.show();
	}
}
