package com.demo.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}	
	}
	public static boolean checkPrime(int k) {
		for(int i=2;i<k;i++) {
			if(k==2) {
				return true;
			}else {
				if(k%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
