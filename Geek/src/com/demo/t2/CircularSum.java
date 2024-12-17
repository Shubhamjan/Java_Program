package com.demo.t2;

public class CircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {3,5,2,6};
		int k=0;
		int sum=0;
		int[]result=new int[num.length]
		for(int i=0;i<num.length;i++) {
			if(k==i) {
				continue;
			}else {
				sum=sum+num[i];
			}
			k++;
		}
		System.out.println(sum);
	}

}
