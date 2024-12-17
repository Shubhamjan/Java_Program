package com.demo.abstractDemo;

public class TestFood {
public static void main(String[] args) {
	Food f1;
	f1=new Maggi();
	f1.prepare();
	System.out.println("-------");
	Food f2=new Sandwich();
	f1.prepare();
	System.out.println(f1.equals(f2));
}
}
