package com.demo.t2;
import java.util.*;
public class Leetcode2354 {
	public static void main(String[] args) {
		int[]nums= {1,15,6,3};
		int sum=0;
		int fi=0;
		for (int i = 0; i < nums.length; i++) {
			fi=fi+nums[i];
			while (nums[i] != 0) {
				int rem = nums[i] % 10;
				sum = sum + rem;
				nums[i] = nums[i] / 10;
			}
		}
		System.out.println( Math.abs(fi - sum));
		System.out.println(fi);
	}
}
