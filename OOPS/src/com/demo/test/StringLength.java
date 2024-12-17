package com.demo.test;

import java.util.*;

class StringLength {
	// write a program to accept some names of your friend and store them in one
	// array and print only those name whose length is five
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[4];
		System.out.println("Enter the input:-");
		for (int i = 0; i < 4; i++) {
			name[i] = sc.next();
		}
		System.out.println("-----------------");
		for (int i = 0; i < 4; i++) {
			if (name[i].length() == 5) {
				System.out.println(name[i]);
			}
		}

	}
}