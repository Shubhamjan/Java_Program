package com.demo.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(5);
		a1.add(8);
		a1.add(2);
		a1.add(1);
		System.out.println(a1);
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
