package com.demo.t2;

import java.util.*;

public class LeetCode1876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>();
		String s ="aababcabc";
		int k = 3;
		int front = 0;
		int ctr = 0;
		int rear = front + 2;
		for (int i = front; rear < s.length(); i++) {
			String str = s.substring(i, rear + 1);
			lst.add(distinctString(str));
			System.out.println(str);
			rear++;
		}
		System.out.println(lst);
		for (String i : lst) {
			if (i != null) {
				ctr++;
			}
		}
		System.out.println(ctr);
	}

	public static String distinctString(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
			}
		}
		if (set.size() == str.length()) {
			return str;
		} else {
			return null;
		}
	}

}
