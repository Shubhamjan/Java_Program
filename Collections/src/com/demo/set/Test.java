package com.demo.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void removeDuplicate(int[]a) {
		
//		Set<Integer>lst=new LinkedHashSet<>();
		Set<Integer>lst=new TreeSet<>();
		for(int i=0;i<a.length;i++) {
			lst.add(a[i]);
		}
		System.out.println(lst);
	}
	public static void main(String[] args) {
		
		int []a= {34,56,7,8,34,89,56,8};
		removeDuplicate(a);
	}
}
