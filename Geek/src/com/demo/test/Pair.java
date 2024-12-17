package com.demo.test;

public class Pair {
	public static void main(String[] args) {
	    int index=0;
        long sum1=0;
        long sum2=0;
        int n=5;
        int[] arr= {1,3,5,2,2};
        for(int i=0;i<n;i++){
            if(i==arr[i]){
                index=i;
                break;
            }
        }
        for(int i=0;i<index;i++){
            sum1=sum1+arr[i];
        }
        for(int i=index+1;i<n;i++){
            sum2=sum2+arr[i];
        }
        if(sum1==sum2){
        	System.out.println(index);
        }
        
        
	}
}
