package com.demo.t2;
import java.util.*;
public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a-bC-dEf-ghIj";
		 char[]str=s.toCharArray();
	        int front=0;
	        int rear=str.length-1;
	        while(front<rear){
	            if(!Character.isLetter(str[front])){
	                front++;
	            }else if(!Character.isLetter(str[rear])){
	                rear--;
	            }else {
	            	char temp=str[front];
		            str[front]=str[rear];
		            str[rear]=temp;
		            front++;
		            rear--;
	            }
	        }
        String result=new String(str);
//        System.out.println(Arrays.toString(str));
        System.out.println(result);
	}
//	"Qedo1ct-eeLg=ntse-T!"
}
