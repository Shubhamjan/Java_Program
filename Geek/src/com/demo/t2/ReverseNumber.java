package com.demo.t2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-120;
		long rev=0;
		while(x!=0) {
			int digit=x%10;
			rev=rev*10+digit;
			x=x/10;
			if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
				System.out.println(0);
			}
		}
		System.out.println((int)rev);
	}

}
