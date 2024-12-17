package com.demo.exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			int[] a = { 234, 456, 677 };
//			System.out.println(a.length / args.length);
			System.out.println(a[5]);
		} catch (ArithmeticException e) {
			System.out.println("Arguments are not passed correct");
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Index given is not found");
		}

	}
//	main();
}
