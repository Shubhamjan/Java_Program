package com.demo.test;

import java.util.HashMap;

public class pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1, 5, 7, 1};
		int n=arr.length;
		int k=6;
//		int i=0;
		 HashMap<Integer, Integer> m = new HashMap<>();
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (m.containsKey(k - arr[i])) {
	                count += m.get(k - arr[i]);
	            }
	            if (m.containsKey(arr[i])) {
	                m.put(arr[i], m.get(arr[i]) + 1);
	            }
	            else {
	                m.put(arr[i], 1);
	            }
       
	        }
	        System.out.println(count);
	}
}
