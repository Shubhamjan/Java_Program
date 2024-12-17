package com.demo.filehandling;

import java.io.File;
import java.io.IOException;

public class FileClsDemo {
	public static void main(String[] args) throws IOException {
		File f1=new File("note.txt");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f1.getAbsolutePath());
	}
}
