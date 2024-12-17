package com.demo.test;
public class GetNotes implements Book1,Book2{

	public void showNotes(){
		System.out.println("All NOTES RECIEVED");
	}
	
	public static void main(String[] args) {
		GetNotes g=new GetNotes();
		g.showNotes();
	}
}