package com.demo.test;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5;k++) {
				if(i==1||i==5) {
					System.out.print("*"+" ");
				}else {
					if(k==1 ||k==5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
