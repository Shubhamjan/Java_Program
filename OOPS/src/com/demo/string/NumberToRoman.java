package com.demo.string;

public class NumberToRoman {
	public static void main(String[] args) {
		int number=99;
		System.out.println(toRoman(number));
	}

	private static String toRoman(int num) {
		// TODO Auto-generated method stub
//		String rm="MDCLXVI";
//		int []a = {1000,500,100,50,10,5,1};
//		int cnt=0;
//		while(no>0) {
//			int d=no/a[cnt];
//			for(int i=1;i<=d;i++) {
//				System.out.print(rm.charAt(cnt));
//			}
//			no=no%a[cnt];
//			cnt++;
//		}
		int []intCode= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String []code= {"M","CM","D","CD","C","XC","L","XL","X","V","IV","I"};
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<intCode.length;i++) {
			while(num>=intCode[i]) {
				sb.append(code[i]);
				num-=intCode[i];
			}
		}
		return sb.toString();
	}
}
