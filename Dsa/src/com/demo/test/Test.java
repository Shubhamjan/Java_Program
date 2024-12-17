package com.demo.test;

import java.util.Scanner;

//import com.demo.bean.Fibo;

public class Test {
	public static int fibo(int n) {
//		System.out.println("hi");
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			System.out.print(fibo(n-1) + fibo(n-2) + " "); 
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
//		Fibo f=new Fibo();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));
	}
}
