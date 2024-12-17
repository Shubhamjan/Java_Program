package com.demo.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		FileWriter f1=new FileWriter("Book.txt");
		f1.write("1001 Core Java EBalgurusamy");
		f1.write("\n Head First Java Lathy Siera");
		f1.close();
	}
}
