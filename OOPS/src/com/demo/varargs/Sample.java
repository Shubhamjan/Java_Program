package com.demo.varargs;

public class Sample {
	public static int sum(int ...k) {
		int total=0;
		for(int i=0;i<k.length;i++) {
			
			total=total+k[i];
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(Sample.sum(50,56,78));
	}
}
