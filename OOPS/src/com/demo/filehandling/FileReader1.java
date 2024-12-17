package com.demo.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader f1=new FileReader("Book.txt");
			while(true) {
				int c=f1.read();
				if(c==-1) {
					break;
				}
				System.out.print((char)c);
//				System.out.print(c);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
