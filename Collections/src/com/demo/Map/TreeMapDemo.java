package com.demo.Map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,Integer>t= new TreeMap<>();
		
		t.put("Abc", 200);
		t.put("zbc",1000);
		t.put("fc",30000);
		t.put("kfc",500);
		System.out.println(t);
	}
}
