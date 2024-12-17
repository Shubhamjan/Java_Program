package com.demo.test;

import java.util.*;

public class SortingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 sentence4 This1 a3";
		   int index=0;
	        String f="";
	        Map<Integer,String>map=new TreeMap<>();
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' '){
	                String sub=s.substring(index,i-1);
	                int key=Character.getNumericValue(s.charAt(i-1));
	                map.put(key,sub);
	                index=i+1;
	            }
	            
	        }
	        int key=Character.getNumericValue(s.charAt(s.length()-1));
	        String last=s.substring(index,s.length()-1);
	        map.put(key, last);
	        for(Map.Entry<Integer,String>i:map.entrySet()){
//	        	if(i.getKey()==1) {
//	        		f=i.getValue()+" ";
//	        	}else {
	        		f=f+i.getValue()+" ";
	        	
	           
	        }
//	        return f;
	        System.out.println(f);
	        System.out.println(map);
	}

}
