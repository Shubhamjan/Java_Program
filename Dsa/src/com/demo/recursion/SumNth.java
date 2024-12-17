package com.demo.recursion;

import java.util.Scanner;

public class SumNth {
	public static void main(String[]args) {
//		System.out.println("Enter the number:");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int n=5;
		System.out.println(sumNum(n));
	}

	private static int sumNum(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return n+sumNum(n-1);
		}
	}
}

