package com.demo.Thread;

public class PrimeNoThread extends Thread {
	
	
	public void run() {
		for(int i=2;i<=100;i++) {
			boolean flag=checkPrime(i);
			if(flag) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
	}
	
		
	

	private boolean checkPrime(int i) {
		// TODO Auto-generated method stub
		if(i==2) {
			return true;
		}else {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					return false;
				}
			}
		}
		return true;
	}
}
