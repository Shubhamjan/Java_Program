package com.demo.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer[] a={7,2,4,5,6};
		List l=Arrays.asList(a);
		Collections.sort(l);
		Collections.reverse(l);
		System.out.println(l);
		
	}
}
