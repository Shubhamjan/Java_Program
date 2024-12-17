package com.demo.t2;
import java.util.*;
public class SumUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Map<Integer,Integer>map=new HashMap<>();
		  int[]nums= {1,2,3,2};
	        int sum=0;
	        for(int i=0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i],1);
	            }else{
	                map.put(nums[i],map.get(nums[i])+1);
	            }
	        }
	        for(Map.Entry<Integer,Integer>i:map.entrySet()){
	            if(i.getValue()==1){
	                sum=sum+i.getValue();
	            }
	        }
//	        return sum;
	        System.out.println(sum);
	}

}
