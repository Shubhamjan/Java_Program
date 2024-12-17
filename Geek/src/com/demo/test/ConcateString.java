package com.demo.test;
import java.util.*;
public class ConcateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 sentence4 This1 a3";
		  Map<String,Integer>map=new TreeMap<>();
	        String result=" ";
	        int last=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' '){
	                int index= i-1;
	                String sub=s.substring(last,index);
	                map.put(sub,(int)s.charAt(index));
	            }
	            last=i;
	        }
	       for(Map.Entry<String,Integer>j:map.entrySet()){
	        result=result+j.getKey()+" ";
	       }
//	       return result;
	       System.out.println(map);
	}

}
