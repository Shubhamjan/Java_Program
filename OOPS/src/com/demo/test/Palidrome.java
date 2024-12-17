package com.demo.test;

public class Palidrome {
	
	public static boolean check(int a) {
		int sum=0;
		int temp=a;
		while(a!=0) {
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		if(temp==sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		boolean flag=check(a);
		if(flag) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
