package com.demo.string;

public class AsciiOfString {
	public static void main(String[] args) {
		String s="Shubham";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int val=(int)ch;
			System.out.println(s.charAt(i)+" ="+val);
		}
	}
}
