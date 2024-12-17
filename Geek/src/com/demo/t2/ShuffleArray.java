package com.demo.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
	public static void main(String[] args) {
		int[]a= {2,5,7,8};
		List<Integer>lst=new ArrayList<>();
		for(Integer i:a) {
			lst.add(i);
		}
		Collections.shuffle(lst);
		for(int i=0;i<a.length;i++) {
			a[i]=lst.get(i);
		}
		System.out.println(Arrays.toString(a));
		
	}
}
