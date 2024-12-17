package com.demo.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class CalculateDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader f1=new FileReader("Book.txt");
		int cap=0;
		int small=0;
		int dig=0;
		int c;
		int sp=0;
		while((c=f1.read())!=-1) {
			if(c>=65 &&c<=90 &&(char)c!=' ') {
				cap++;
			}
			if(c>=97 && c<=122 &&(char)c!=' ') {
				small++;
			}
			if(Character.isDigit((char)c )&&(char)c!=' '){
				dig++;
			}
			if((char)c==' '){
				sp++;
			}
		}
		System.out.println("Upper case letter ="+cap);
		System.out.println("smaller case letter ="+small);
		System.out.println("Digits ="+dig);
	}
}
