package com.demo.test;

import java.io.FileReader;
import java.io.IOException;

public class Solution {
//write the program to count the no of  vowels from any file.

	private static int countVowels() throws IOException {

		FileReader r = new FileReader("Book.txt");
		int count = 0;
		int val=0;
		while (true) {
			val=r.read();
			if(val==-1) {
				break;
			}
			char cl=(char)val;
//			System.out.println(cl);
			char ch=Character.toLowerCase(cl);
//			System.out.println(ch);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				System.out.println(ch);
				count++;
			}
		}

			return count;
	}

	public static void main(String[] args) throws IOException {
		int count = countVowels();
		System.out.println("The no of vowels in file:- " + count);
	}

}
