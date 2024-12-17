package com.demo.test;

import java.util.Arrays;

public class rotaate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5};
		int d=2;
		int k=0;
        while(d!=0){
            
        int temp=arr[k];
        // int sum=0;
        for(int i=0;i<arr.length-1;i++){
            
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
            d--;
    }
     System.out.println(Arrays.toString(arr));
	}

}
