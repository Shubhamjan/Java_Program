package com.demo.Thread;

public class Main {
	public static void main(String[] args) {
//		MessageThread m=new MessageThread();
//		TableThread t=new TableThread();
//		m.start();
//		t.start();
//		t.setPriority(9);
//		PrimeNoThread p=new PrimeNoThread();
//		p.start();
//		ArmStrong a=new ArmStrong();
//		a.start();
//		ThreadRunnable t=new ThreadRunnable();
//		Thread th=new Thread(t);
//		th.start();
		Table t=new Table();
//		MyThread m=new MyThread(t);
//		m.start();
		MyThread2 m2=new MyThread2(t);
		MyThread3 m3=new MyThread3(t);
		m2.start();
		m3.start();
		
	}
}
