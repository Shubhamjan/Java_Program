package com.demo.t2;
import java.util.*;
public class SortColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {2,0,2,1,1,0};
		
		int low=0;
		int mid=0;
		int high=nums.length-1;
		
		while(mid<=high) {
			if(nums[mid]==0) {
				int temp=nums[low];
				nums[low]=nums[mid];
				nums[mid]=temp;
				low++;
				mid++;
			}else if(nums[mid]==1) {
				mid++;
			}else {
				int temp=nums[mid];
				nums[mid]=nums[high];
				nums[high]=temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
