package com.demo.assignment;

public class AdvanceCalculator extends Calculator {

	public int add(int[]arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i:arr) {
			sum=sum+i;
		}
		return sum;
	}
}
