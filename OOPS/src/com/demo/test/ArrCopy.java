package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrCopy {
	
	public int[] acceptArray() {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		System.out.println("Enter the Array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public void reverseArr(int[]b) {
		int[]re=new int[b.length];
		int k=b.length-1;
		for(int i=0;i<re.length;i++) {
			re[i]=b[k];
			k--;
		}
		System.out.println(Arrays.toString(re));
	}
	public static void main(String[] args) {
		ArrCopy a=new ArrCopy();
		int []b=a.acceptArray();
		a.reverseArr(b);
	}
}
