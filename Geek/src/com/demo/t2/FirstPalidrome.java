package com.demo.t2;

public class FirstPalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] words = {"abc","car","ada","racecar","cool"};
		String r="";
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            String emp="";
            for(int j=words[i].length()-1;j>=0;j--){
                emp=emp+words[i].charAt(j);
            }
            if(temp.equals(emp)){
                r=temp;
                break;
            }
        }
        System.out.println(r);
	}

}
