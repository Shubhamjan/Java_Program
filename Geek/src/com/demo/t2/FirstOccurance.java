package com.demo.t2;

import java.util.*;

public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "a";
		String needle = "a";
		Map<String, Integer> map = new HashMap<>();
		if (haystack.length() != 1) {
			for (int i = 0; i < haystack.length() - 1; i++) {
				for (int j = i + 1; j < haystack.length(); j++) {
					String str = haystack.substring(i, j);
					map.put(str, i);
				}
			}
			System.out.println(map);
			for (Map.Entry<String, Integer> ct : map.entrySet()) {
				if (ct.getKey().equals(needle)) {
					System.out.println(ct.getValue());
					break;
				}
			}
		}

	}

}
