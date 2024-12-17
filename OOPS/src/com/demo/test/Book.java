package com.demo.test;

public class Book {
	private String name;
	
	private String author;
	
	Book(){
		
	}
	Book(String name,String author){
		this.name=name;
		this.author=author;
	}
	
	public String toString() {
		return name+" "+author;
	}
}
