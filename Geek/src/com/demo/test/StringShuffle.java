package com.demo.test;

public class StringShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codeleet";
		int[]indices = {4,5,6,7,0,2,1,3};

		String r="";
        for(int i=0;i<indices.length;i++){
            r=r+s.charAt(indices[i]);
        }
        System.out.println(r);
	}

}
