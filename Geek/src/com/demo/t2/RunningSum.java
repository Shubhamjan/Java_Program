package com.demo.t2;

import java.util.Arrays;

public class RunningSum {
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[]nums = {1,2,3,4};
        for(int i=0;i<nums.length;i++){
        	if(i==0){
        		continue;
        	}else{
        		int temp=nums[i]+nums[i-1];
        		nums[i]=temp;
        	}
       }
       System.out.println(Arrays.toString(nums));
    }
}
