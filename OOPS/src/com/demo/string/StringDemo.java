package com.demo.string;

//write a program to accept string and print the suum of all capital character ascii value
public class StringDemo {
	public static void main(String[] args) {
		String str = "ABcdefHnL";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			int ch = (int) str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				sum = sum + ch;
			}
		}
		System.out.println("The sum is "+sum);
	}
}
