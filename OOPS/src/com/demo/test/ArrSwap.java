package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSwap {
	public int[] acceptArr() {
		Scanner sc=new Scanner(System.in);
		int []ab=new int[10];
		System.out.println("Enter the Array Elements:-");
		for(int i=0;i<ab.length;i++) {
			ab[i]=sc.nextInt();
		}
		return ab;
	}
	
	public void swapArr(int[]a,int[]b) {
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			a[i]=b[i];
			b[i]=temp;
		}
		System.out.println("First Array:-"+ Arrays.toString(a));
		System.out.println("Second Array:- "+Arrays.toString(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrSwap a=new ArrSwap();
		int[]ar1=a.acceptArr();
		int[]ar2=a.acceptArr();
		System.out.println("Before swapping---------");
		System.out.println("First Array:- "+Arrays.toString(ar1));
		System.out.println("Second Array:- "+Arrays.toString(ar2));
		System.out.println("After swapping---------");
		a.swapArr(ar1,ar2);
	}

}
