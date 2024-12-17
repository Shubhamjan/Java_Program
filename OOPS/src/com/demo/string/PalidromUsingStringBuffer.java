package com.demo.string;

import java.util.Scanner;

public class PalidromUsingStringBuffer {
	public static void main(String[] args) {
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:-");
		s1=sc.next();
		
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		if(s1.equals(s2.toString())) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
