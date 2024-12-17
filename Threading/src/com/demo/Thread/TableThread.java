package com.demo.Thread;

public class TableThread extends Thread{

	public void run() {
		int no=15;
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%5d",i*no);
		}
	}
}
