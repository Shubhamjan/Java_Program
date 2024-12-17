package com.demo.test;

import java.util.Scanner;

public class Rotate {
	public static boolean isRotated(String str1, String str2)
    {
        char []a=str1.toCharArray();
        char[]second=str1.toCharArray();
        int i=0;
        while(i<2){
            int j=0;
            int m=second.length-1;
            char temp=a[j];
            char temp2=second[m];
            while(j<a.length-1 && m>=1){
                a[j]=a[j+1];
                j++;
                
                second[m]=second[m-1];
                m--;
            }
            a[j]=temp;
            second[m]=temp2;
            i++;
        }
        String b=String.valueOf(a);
        String c=String.valueOf(second);
        if(b.equals(str2) &&c.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1="amazon";
		 String str2="azonam";
		 System.out.println(isRotated(str1,str2));
	}
//	
//	
}
