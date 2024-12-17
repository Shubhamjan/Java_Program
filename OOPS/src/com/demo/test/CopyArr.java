package com.demo.test;
import java.util.*;
public class CopyArr {
	
	public static void cpy(int[] a) {
		int []b=new int[a.length];
		int k=a.length-1;
		for(int i=0;i<b.length;i++) {
			b[i]=a[k];
			k--;
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("Entert the array Element:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		cpy(a);
		
	}

}
