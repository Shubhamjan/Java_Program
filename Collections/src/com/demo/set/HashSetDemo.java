package com.demo.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(45);
		s.add(45);
		s.add(23);
		s.add(85);
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(s);
	}
}
