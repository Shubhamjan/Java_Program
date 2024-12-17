package com.demo.slidingWindow;
import java.util.*;
public class CountDistinctOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>lst=new ArrayList<>();
		int []arr= {1,2,1,3,4,2,3};
		int front=0;
		int rear=front+3;
		for(int i=0;rear<arr.length;i++) {
			lst.add(distinct(arr,i,rear));
			rear++;
		}
		System.out.println(lst);
	}
	
	public static int distinct(int[]arr,int start,int end) {
		Set<Integer>set=new HashSet<>();
		for(int i=start;i<=end;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		return set.size();
	}

}
