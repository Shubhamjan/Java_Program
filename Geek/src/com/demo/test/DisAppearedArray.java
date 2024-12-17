package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisAppearedArray {
	public static void main(String[]args) {
		int []nums = {4,3,2,7,8,2,3,1};
		List<Integer>lst=new ArrayList<>();
		Set<Integer>set=new HashSet<>();
		for(Integer i:nums) {
			set.add(i);
		}
		
		System.out.println(lst);
	}
}
