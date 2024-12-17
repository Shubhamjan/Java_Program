package com.demo.t2;
import java.util.*;
public class LogestPalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		 Map<String,Integer>map=new TreeMap<>();
	        for(int i=0;i<s.length()-2;i++){
	            String temp="";
	            for(int j=i+1;j<s.length();j++){
	                temp=s.substring(i,j);
	                String rev=new StringBuilder(temp).reverse().toString();
	                if(rev.equals(temp)){
	                    map.put(temp,temp.length());
	                }
	            }
	        }
	        int temp=0;
	        String t="";
	        for(Map.Entry<String, Integer>i:map.entrySet()) {
	        	if(i.getValue()>temp) {
	        		temp=i.getValue();
	        		t=i.getKey();
	        	}
	        }
	        System.out.println(t);
	}

}
