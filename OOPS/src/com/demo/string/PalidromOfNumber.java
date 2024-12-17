package com.demo.string;

import java.util.Scanner;

public class PalidromOfNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:-");
		n=sc.nextInt();
		String s1=String.valueOf(n);
//		s1.codePointAt(n);
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		if(s1.equals(s2.toString())) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
//		System.out.println(s1.);
	}
}
