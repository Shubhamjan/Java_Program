package com.demo.t2;

public class LeetCode389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd", t = "abcde";
		int i=0;
		int j=0;
		int sum1=0;
		int sum2=0;
		while(i<s.length()||j<t.length()) {
			if(i<s.length()) {
				sum1=sum1+(int)s.charAt(i);
			}
			sum2=sum2+(int)t.charAt(j);
			i++;
			j++;
		}
//		int temp=(char)sum2-sum1;
//		System.out.println(temp);
		System.out.println("sum2"+"= "+sum2+"     "+"sum1"+"= "+sum1);
	}

}
