package com.demo.string;

public class String_Demo {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";

		char[] a = { 'a', 'b', 'c' };
		String s3 = new String(a);
		System.out.println(s3.length());
		System.out.println(a.length);
		System.out.println(s3.charAt(2));
		System.out.println(s3.codePointAt(0));// give ascii value of character
		System.out.println(s2.compareTo(s3));// check individual character.it return diffence between ascii value of
												// character when first diffence ouccured
	}

}
