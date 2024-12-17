package com.demo.t2;

public class MaxUnitOnTruck {
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int sum=0;
        int[][]boxTypes = {{1,3},{2,2},{3,1}};
        for(int i=0;i<boxTypes.length;i++){
            for(int j=0;j<boxTypes[i].length-1;j++){
                if(i==boxTypes.length-1){
                    sum=sum+boxTypes[i][j]*1;
                }else{
                    sum=sum+boxTypes[i][j]*boxTypes[i][j+1];
                }
            }
        }
        System.out.println(sum);
	}
}