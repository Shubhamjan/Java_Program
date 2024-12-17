package com.demo.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("Book.txt");
		Scanner sc=new Scanner(f1);
		System.out.println(sc.nextLine());
		System.out.println(sc.next());
	}
}
