package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindDuplicate {
	 public static ArrayList<Integer> duplicates(int arr[], int n) {
	        // code here
	        Map<Integer,Integer>count=new HashMap<>();
	        ArrayList<Integer>lst=new ArrayList<>();
	        for(int i=0;i<arr.length;i++){
	            if(!count.containsKey(arr[i])){
	                count.put(arr[i],1);
	            }else{
	                count.put(arr[i],count.get(arr[i])+1);
	            }
	            if(count.get(arr[i])==2){
	                lst.add(arr[i]);
	            }
	        }
	        Collections.sort(lst);
	        if(lst.isEmpty()){
	            return lst;
	        }else{
	            return lst;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,1,2,3,4,3,5,1,4,2};
		System.out.println(duplicates(arr,arr.length));
	}

}
