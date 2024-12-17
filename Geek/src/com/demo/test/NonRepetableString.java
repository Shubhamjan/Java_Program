package com.demo.test;

import java.util.HashSet;
import java.util.Set;

public class NonRepetableString {
	  public static String removeDuplicates(String str) {
	        StringBuilder a=new StringBuilder();
	        Set<Character>set=new HashSet<>();
	        
	        for(int i=0;i<str.length();i++){
	            if(!set.contains(str.charAt(i))){
	                set.add(str.charAt(i));
	                a.append(str.charAt(i));
	            }
	        }
	        String b=str.toString();
	        System.out.println(set);
	        return b;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicates("geeksforgeeks"));
	}

}
