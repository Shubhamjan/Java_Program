package com.demo.set;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		l.add(23);
		l.add(32);
		l.add(23);
		l.add(56);
		l.add(12);
		System.out.println(l);
	
	
	}
}
