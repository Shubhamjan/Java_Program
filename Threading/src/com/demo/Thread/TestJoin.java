package com.demo.Thread;

public class TestJoin extends Thread{
	
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);  
		}
	
	}
	
	public static void main(String[] args) {
		TestJoin j1=new TestJoin();
		TestJoin j2=new TestJoin();
		TestJoin j3=new TestJoin();
		
		
		j1.start();

		j2.start();
		j2.start();
		
	}
}
