package com.demo.test;

import java.util.Arrays;

public class BuubleSort {
	public static void main(String[] args) {
		int[] a= {12,6,34,1,67,4,3};
//		System.out.println(Arrays.sort(a));
//		System.out.println(Arrays.toString(sortArr(a)));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static int[] sortArr(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
//				System.out.println(Arrays.toString(a));
			}
		}
		return a;
//		return Arrays.sort(a);
	}
}
