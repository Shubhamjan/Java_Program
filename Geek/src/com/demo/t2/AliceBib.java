package com.demo.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AliceBib {
	public static void main(String[] args) {
		int[] nums = { 5, 4, 2, 3 };
		List<Integer> lst = new ArrayList<>();
		for (int i : nums) {
			lst.add(i);
		}
		int k = 0;
		int t = 0;
		int[] r = new int[nums.length];
		Collections.sort(lst);
		for (int i = 0; i < lst.size() - 2; i++) {
			int Alice = lst.get(t);
			int Bob = lst.get(t + 1);
			t = t + 2;
			r[k] = Bob;
			k++;
//	          lst.remove(0);
			r[k] = Alice;
			k++;
//	          lst.remove(1);
			System.out.println(lst);
		}
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(r));
	}

}
