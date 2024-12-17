package com.demo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();
		
		a.addFirst(23);
		a.add(14);
		a.add(18);
		a.add(54);
		a.add(74);
		a.addFirst(13);
//		Integer r=a.peek();
//		System.out.println(r);
		
//		Iterator i=a.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		ArrayList<Integer>lst=new ArrayList<>();
//		lst.addAll(a);
//		System.out.println("ArrayList:-"+lst);
//		System.out.println("----------------------");
//		ListIterator l1=a.listIterator(2);
//		while(l1.hasNext()) {
//			System.out.println(l1.next());
//		}
//		System.out.println("----------------------");
//		ListIterator l2=a.listIterator(a.size());
//		while(l2.hasPrevious()) {
//			System.out.println(l1.previous());
//		}
//		Collections.reverse(a);
		Collections.shuffle(a);
		System.out.println(a);
	}
}
