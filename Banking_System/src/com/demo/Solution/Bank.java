package com.demo.Solution;

import java.util.Scanner;

import com.demo.Service.Transaction;

public class Bank {
	public static void main(String[]args) {
		Transaction tc=new Transaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create acount\n2.View Account");
		System.out.println("Enter choice");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			tc.createAccount();
		}
	}
}
