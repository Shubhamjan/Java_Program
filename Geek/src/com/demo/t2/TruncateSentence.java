package com.demo.t2;

public class TruncateSentence {
	public static void main(String[] args) {
	       String  s = "Hello how are you Contestant";
	        int k = 4;
	         String r="";
	        int i=0;
	        int ctr=0;
	        while(i<s.length()){
//	            int ctr=0;
	            if(s.charAt(i)==' '){
	                ctr++;
	            }
	            if(ctr==k){
	                break;
	            }
	            i++;
	        }
	        r=r+s.substring(0,i);
	        System.out.println(i);
	        System.out.println(r);
	}
}