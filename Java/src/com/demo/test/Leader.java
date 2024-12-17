package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Try programiz.pro");
        int []arr={16,17,4,3,5,2};
        List<Integer>lst=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int ctr=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    ctr++;
                }
            }
            if(ctr==arr.length-i){
                lst.add(arr[i]);
            }
        }
        lst.add(arr.length-1);
        for(Integer i:lst){
            System.out.println(i);
        }
	}

}
