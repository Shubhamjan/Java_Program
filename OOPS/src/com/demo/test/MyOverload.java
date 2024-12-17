package com.demo.test;

public class MyOverload {
	
	public void showMessage() {
		System.out.println("Good Afternoon");
	}
	
	public void showMessage(String msg) {
		System.out.println(msg);
	}
	
	public void showMessage(String msg,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOverload m=new MyOverload();
		m.showMessage();
		m.showMessage("hi");
		m.showMessage("hi", 5);
	}

}
