package com.demo.t2;

import java.util.Arrays;

public class FirstandLast {
	public static void main(String[] args) {
		int[] nums = {1};
		int target = 1;
		int front = 0;
		int end = nums.length - 1;
		int[] r = new int[2];
		r[0] = -1;
		r[1] = -1;
		if (nums.length>1) {
			while (front != nums.length - 1) {
				if (nums[front] == target) {
					r[0] = front;
					break;
				}
				front++;
			}
			while (end >= 0) {
				if (nums[end] == target) {
					r[1] = end;
					break;
				}
				end--;
			}
			System.out.println(Arrays.toString(r));
		}
		if(nums.length==1) {
			if(nums[0]==target) {
				r[0]=0;
				r[1]=0;
			}
		}
		System.out.println(Arrays.toString(r));
	}
}