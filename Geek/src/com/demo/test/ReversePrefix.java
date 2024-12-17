package com.demo.test;

public class ReversePrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "abcdefd";
		char ch='d';
		int index=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        String sub=word.substring(0,index+1);
//        StringBuilder str=new StringBuilder(sub).reverse().toString();
        String str="";
        for(int i=sub.length()-1;i>=0;i--) {
        	str=str+sub.charAt(i);
        }
        String sub2=word.substring(index+1,word.length());
        String result=str+sub2;
        System.out.println(result);
	}

}
