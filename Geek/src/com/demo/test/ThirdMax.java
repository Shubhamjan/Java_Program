package com.demo.test;

import java.util.Arrays;

public class ThirdMax {
	public static void main(String[] args) {
		int[] nums= {2,2,3,1};
		Arrays.sort(nums);
        if(nums.length>2){
            for(int i=0;i<nums.length;i++){
                int temp=nums[0];
                if(nums[i]>temp){
                    temp=nums[i];
                }
            }
            System.out.println(nums[2]);
        }else{
            System.out.println(nums[1]);
        }
	}
}
