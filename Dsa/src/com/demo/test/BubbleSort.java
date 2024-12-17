package com.demo.test;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int []a= {49,0,1,77,2,90,12};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
//i=0
//j=0
//0,49,1,77,2,90,12
//
//i=0
//j=1
//0,1,49,77,2,90,12
//
//j=3
//0,1,49,2,77,90,12
//
//j=5
//0,1,49,2,77,12,90