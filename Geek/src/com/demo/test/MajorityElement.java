package com.demo.test;

import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Map<Integer,Integer>lst=new HashMap<>();
		  int[]a = {3,1,5,7,2};
		  int num=-1;
	        for(int i=0;i<a.length;i++){
	            if(!lst.containsKey(a[i])){
	                lst.put(a[i],1);
	            }else{
	                lst.put(a[i],lst.get(a[i])+1);
	            }
	        }
	        System.out.println(lst);
	        for(Map.Entry<Integer,Integer>j:lst.entrySet()) {
	        	if(j.getValue()>a.length/2) {
	        		num=j.getKey();
	        	}
	        }
	        System.out.println(num);
	}

}
