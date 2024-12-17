package com.demo.test;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String str="";
        for(int i=0;i<s.length();i++){
            str=str+s.substring(i,i+1).toLowerCase();
        }
        System.out.println(str);
	}

}
