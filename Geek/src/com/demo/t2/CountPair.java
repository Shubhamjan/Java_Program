package com.demo.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>nums = new ArrayList<>();
		nums=Arrays.asList(-1,1,2,3,1);
		int target = 2;
		 int ctr=0;
	        for(int i=0;i<nums.size()-1;i++){
//	            int sum=0;
	            for(int j=i+1;j<nums.size();j++){
	            	int sum=0;
	                sum=nums.get(i)+nums.get(j);
	                if(sum<target) {
	                	ctr++;
	                }
	            }
//	            if(sum<target){
//	                ctr++;
//	            }
	        }
	        System.out.println(ctr);
	}

}
