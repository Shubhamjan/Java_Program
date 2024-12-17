package com.demo.test;

public class SeatArrange {
	public static void main(String[]args) {
		int[]seats= {0,0,1,0,0,0,1};
		int m=seats.length;
		int n=2;
        for(int i=0;n!=0&&i<m;i++){
            if(i==0){
                if(seats[i]==0&&seats[i+1]!=1){
                    seats[i]=1;
                    n--;
                }
            }else if(i==m-1&&seats[i]==0&&seats[m-2]==0){
                    seats[m-1]=1;
                    n--;
                }else if(seats[i]==0&&seats[i-1]==0&&seats[i+1]==0){
                    seats[i]=1;
                    n--;
                }
            }
        
        if(n==0){
           System.out.println("yes");
        }else{
        	System.out.println("no");
        }
	}
}
