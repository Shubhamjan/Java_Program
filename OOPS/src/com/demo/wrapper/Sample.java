package com.demo.wrapper;

public class Sample {
	public static void main(String[] args) {
		int a=10;
		Integer b=a;//autoboxing
		
		Float c=10.2f;
		float v=c;//unboxing
		
		String str="234";
		int x=Integer.parseInt(str);
		System.out.println(x);
		
		String s=String.valueOf(x);
		System.out.println(x);
		
		Integer r=Integer.valueOf(x);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println("------------------");
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println("------------------");
		
		System.out.println(Integer.max(23, 45));
	}
}
