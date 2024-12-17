package com.demo.t2;

import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
//		while (k > 0) {
//			int temp=nums[nums.length-1];
//			for (int i = nums.length-1; i >=1; i--) {
//				nums[i]=nums[i-1];
//			}
//			nums[0]=temp;
//			k--;
//		}
		int i=nums.length-1;
		while(k!=0 && i>=1) {
			nums[i]=nums[i-1];
		}
	}
}
