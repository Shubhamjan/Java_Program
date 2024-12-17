package com.demo.oop;

public class Object_Demo {
	
	public static void main(String[] args) {
		Object_Demo od=new Object_Demo();
		Object_Demo o=od;
		System.out.println(od.hashCode());
		System.out.println(od.toString());
		System.out.println(od.equals(o));
	}
}
