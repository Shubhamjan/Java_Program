package com.demo.t2;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "1.1.1.1";
		  String s="";
	        for(int i=0;i<address.length();i++){
	           if(address.charAt(i)=='.'){
	            s=s+"[.]";
	           }else{
	            s=s+address.charAt(i);
	           }
	        }
	        System.out.println(s);
	}

}
