package com.demo.oop;

public class MethodOverload {
	
	public void show() {
		System.out.println("Only in simple show");
	}
	public void show(String m,String n) {
		System.out.println("with "+m+" & "+n);
	}
	public void show(String m,int p) {
		for(int i=0;i<p;i++) {
			System.out.println("With String= "+m);
		}
	}
	
}
