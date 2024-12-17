package com.demo.filehandling;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile f1=new RandomAccessFile("book.txt","rw");
		f1.seek(6);
		System.out.println((char)f1.read());
	}
}
