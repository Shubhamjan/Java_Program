package com.demo.test;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :-");
		int num=sc.nextInt();
		boolean flag=checkNum(num);
		if(flag) {
			System.out.println("The num is greater");
		}else {
			throw new SmallNumberException("Please add greater num");
		}
		
	}

	private static boolean checkNum(int num) {
		// TODO Auto-generated method stub
		
		if(num>100) {
			return true;
		}
		return false;
	}
}
