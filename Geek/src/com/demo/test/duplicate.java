package com.demo.test;

import java.util.ArrayList;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try programiz.pro");
        int[]arr={3,4,12,3,12,3,4,4,12,7,11,6};
        int n=13;
         ArrayList<Integer>lst=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int ctr=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    ctr++;
                }
            }
            if(ctr>0){
                lst.add(arr[i]);
            }
        }
        System.out.println(lst);
	}

}

 