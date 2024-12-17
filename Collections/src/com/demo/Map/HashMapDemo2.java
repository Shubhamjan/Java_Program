package com.demo.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer,String>h1=new HashMap<>();
		h1.put(11, "abc");
		h1.put(23, "xyz");
		h1.put(2, "pqr");
		System.out.println(h1);
//		Set set=h1.entrySet(
//		System.out.println(set);
		for(Map.Entry<Integer,String>i:h1.entrySet()) {
			System.out.print("Roll no :-"+i.getKey()+" "+"Name:- "+i.getValue());
		}
		//To make map synchronized
		Map m2=Collections.synchronizedMap(h1);
	}
	
}
