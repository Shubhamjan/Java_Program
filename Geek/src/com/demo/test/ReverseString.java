package com.demo.test;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String S)
	{
        String result="";
        int lst_dot=S.length();
        int dot=0;
        for(int i=S.length()-1;i>=0;i--){
            int temp=i;
            String a="";
            if(S.charAt(i)=='.'){
                dot++;
                if(dot==1){
                    a=S.substring(i+1,lst_dot);
                    lst_dot=i;
                    result=a+"."+result;
                }else {
                	a=S.substring(i+1,lst_dot);
                    lst_dot=i;
                	result=result+a+".";
                }
                
            }
            if(i==0){
                a=S.substring(i,lst_dot);
                lst_dot=i;
                result=result+a;
            }

        }
        return result;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string");
		String a="my.name.is.shubham";
		System.out.println(reverse(a));
	}

}
