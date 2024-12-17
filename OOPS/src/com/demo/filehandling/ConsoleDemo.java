package com.demo.filehandling;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
//		Console c1=new Console();
		Console c1=System.console();
		
		System.out.println("Enter the password");
		char[]p=c1.readPassword();
		String pwd=new String(p);
		System.out.println(pwd);
		
	}
}
