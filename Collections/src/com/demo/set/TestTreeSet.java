package com.demo.set;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Product>t1=new TreeSet();
		t1.add(new Product("pen",5200));
		t1.add(new Product("Book",400));
		t1.add(new Product("MoUSE",1100));
		System.out.println(t1);
	}
}
