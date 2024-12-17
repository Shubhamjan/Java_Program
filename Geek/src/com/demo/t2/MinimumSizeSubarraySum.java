package com.demo.t2;
import java.util.*;
public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 7;
		int[]nums = {2,3,1,2,4,3};
		if (nums == null || nums.length == 0) {
             System.out.println(0);
        }

        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                currSum -= nums[left];
                left++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }

}

