package com.demo.recursion;

public class Fibonaccii {
	public static void main(String[]args) {
		int n=10;
		System.out.println(fibo(n));
	}
	private static int fibo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
}
