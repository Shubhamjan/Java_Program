package com.demo.slidingWindow;

public class SumOfMinAndMaxOfSubarray {
	public static void main(String[]args) {
		int[]arr= {2,5,-1,7,-3,-1,-2};
		int k=4;
		int front=0;
		int rear=front+3;
		int sum=0;
		
		for(int i=0;rear<arr.length;i++) {
			sum=sum+subArray(arr,i,rear);
			rear++;
		}
		System.out.println(sum);
		
	}
	public static int subArray(int[]arr,int start,int end) {
		int small=arr[start];
		int big=arr[start];
		for(int i=1;i<end;i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		return small+big;
	}
}
