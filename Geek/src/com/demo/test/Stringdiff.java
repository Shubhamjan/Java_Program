package com.demo.test;

public class Stringdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
		 String s="hello";
	        char[]d=s.toCharArray();
	        for(int i=0;i<s.length()-1;i++){
	            char first=s.charAt(i);
	            char second=s.charAt(i+1);
	            int n1=(int) first;
	            int n2=(int)second;
	            sum=sum+Math.abs(n1-n2);
	        }
	        System.out.println(sum);
	}

}
