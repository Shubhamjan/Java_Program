package com.demo.exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws IOException {
		FileWriter f1=new FileWriter("sample.txt");
		f1.write("Hello");
		f1.close();
	}
}
