package com.demo.Thread;

public class MyThread extends Thread{
	Table t;
	
	MyThread(Table t){
		this.t=t;
	}
	
	public void run() {
		t.printTable(5);
	}
}
