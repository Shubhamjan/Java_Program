package com.demo.test;

import java.util.ArrayList;

public class Leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>lst=new ArrayList<Integer>();
		int[]arr= {16,17,4,3,5,2};
		int n=arr.length;
		int k=1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>=arr[i+1]) {
				lst.add(arr[i]);
			}else {
				
			}
		}
		System.out.println(lst);
	}

}
