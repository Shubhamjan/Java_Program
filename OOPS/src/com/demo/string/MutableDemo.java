package com.demo.string;

import java.util.Arrays;
import java.util.Scanner;

public class MutableDemo {
	public static void main(String[] args) {
		String s1;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		System.out.println(reverse(s1));
	}

	private static String reverse(String s1) {
		char[] arr=new char[s1.length()];
		int k=0;
		for(int i=s1.length()-1;i>=0;i--) {
			arr[k]=s1.charAt(i);
			k++;
		}
		return new String(arr);
	}
}
