package com.demo.test;

import java.util.Arrays;

public class FindIndex {
	public static void main(String[] args) {
	      int n = 6;
	      int[]arr = { 6, 5, 4, 3, 1, 2 };
	      int key = 4;
	               int start=0;
	              int end=0;
	              int []a=new int[2];
	              boolean flag1=true;
	              boolean flag2=true;
	              //code here.
	              int i=0;
	              int j=n-1;
	              
	              while(i<n && j>=0 ){
	                  if(arr[i]==key && flag1){
	                      start=i;
	                      flag1=false;
	                  }
	                  if(arr[j]==key && flag2){
	                      end=j;
	                      flag2=false;
	                  }
	                  i++;
	                  j--;
	              }
	              a[0]=start;
	              a[1]=end;
	              System.out.println(Arrays.toString(a));
	              
	          }
	}

